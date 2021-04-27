package task3;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private final short employeeID;
    private final String name;
    private double salary;
    private byte noOfLeaves;

    public Employee(short employeeID, String name, double salary, byte noOfLeaves) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
        this.noOfLeaves = noOfLeaves;
    }

    public Employee(short employeeID) {
        this.employeeID = employeeID;
        this.name = null;
        this.salary = 0;
        this.noOfLeaves = 0;
    }

    public Employee() {

        this.employeeID = 0;
        this.name=null;
    }

    public short getEmployeeID() {
        return employeeID;
    }


    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public byte getNoOfLeaves() {
        return noOfLeaves;
    }

    public void setNoOfLeaves(byte noOfLeaves) {
        this.noOfLeaves = noOfLeaves;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID && Double.compare(employee.salary, salary) == 0 && noOfLeaves == employee.noOfLeaves && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID, name, salary, noOfLeaves);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", noOfLeaves=" + noOfLeaves +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return Byte.compare(this.noOfLeaves,o.noOfLeaves);

    }
}
