package task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee((short) 1,"Anuj",200.0,(byte)1));
        employeeList.add(new Employee((short) 4,"Raj",400.0,(byte) 62));
        employeeList.add(new Employee((short) 3,"dbc",600.0,(byte) 4));
        EmployeeLeaveCalculator leaveCalculator =new EmployeeLeaveCalculator();
        List<Short> result=leaveCalculator.getDefaulterEmployeeIDList(employeeList);
        employeeList.forEach(employee -> System.out.println(employee.getSalary()));

    }
}
