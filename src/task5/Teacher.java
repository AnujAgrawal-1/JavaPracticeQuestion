package task5;

import java.util.List;
import java.util.Objects;

public class Teacher {
    private final int employeeId;
    private final String teacherName;
    private double salary;
    private List<String> subjectList;

    public Teacher(int employeeId, String teacherName, double salary, List<String> subjectList) {
        this.employeeId = employeeId;
        this.teacherName = teacherName;
        this.salary = salary;
        this.subjectList = subjectList;
    }

    public Teacher(int employeeId) {
        this.employeeId = employeeId;
        this.teacherName =null;
        this.salary=0;
        this.subjectList=null;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public double getSalary() {
        return salary;
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubjectList(List<String> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return employeeId == teacher.employeeId && Double.compare(teacher.salary, salary) == 0 && Objects.equals(teacherName, teacher.teacherName) && Objects.equals(subjectList, teacher.subjectList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, teacherName, salary, subjectList);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "employeeId=" + employeeId +
                ", teacherName='" + teacherName + '\'' +
                ", salary=" + salary +
                ", subjectList=" + subjectList +
                '}';
    }
}
