package task3;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeLeaveCalculator {
    public List<Short> getDefaulterEmployeeIDList(List<Employee> employeeList) {
        employeeList=removeDuplicateIfExist(employeeList);
        checkNoOfLeaveAndSetSalary(employeeList);
        return employeeList.stream().filter(employee -> employee.getNoOfLeaves() > 25).map(Employee::getEmployeeID).collect(Collectors.toList());

    }

    private void checkNoOfLeaveAndSetSalary(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            if(employee.getNoOfLeaves()>25){
                double salary=employee.getSalary()*(1-0.01);
                employee.setSalary(salary);
            }
        }

    }

    public List<Employee> removeDuplicateIfExist(List<Employee> employeeList){
        TreeSet<Employee> removeDuplicate = new TreeSet<>(employeeList);
        return removeDuplicate.stream().toList();

    }

    public ArrayList<String> getNumberOfLeaves(List<Employee> employeeList) {
        ArrayList<String> stringList = new ArrayList<>();
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                int cmp0 = Byte.compare(a.getNoOfLeaves(), b.getNoOfLeaves());
                if (cmp0 != 0) {
                    return cmp0;
                }
                return a.getName().compareTo(b.getName());
            }
        });


        for (Employee employee : employeeList) {
            String name = employee.getName();
            byte noOfLeave = employee.getNoOfLeaves();
            stringList.add(String.format("%s-%d",name,noOfLeave));
        }
        return stringList;
    }

}

