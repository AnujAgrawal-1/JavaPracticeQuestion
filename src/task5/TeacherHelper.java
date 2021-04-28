package task5;

import java.util.*;
import java.util.stream.Collectors;

public class TeacherHelper {
    public List<Teacher> findSubjectTeacher(List<Teacher> allTeachers, String subjectName) {
        return allTeachers.stream().filter(teacher -> teacher.getSubjectList().contains(subjectName)).collect(Collectors.toList());

    }
     public Set<Teacher> getBusyTeachers(List<Teacher> allTeachers) {
         LinkedHashSet<Teacher> teacherLinkedHashSet = new LinkedHashSet<>(allTeachers);
         Set<Teacher> BusyTeacher = new HashSet<>();
         List<Teacher > teacherList = new ArrayList<>(teacherLinkedHashSet);
         for (Teacher teacher : teacherList) {
             LinkedHashSet<String> teacherLinkedHashSet1=new LinkedHashSet<String>(teacher.getSubjectList());
             if (teacherLinkedHashSet1.size()>=3){
                 BusyTeacher.add(teacher);
                 teacher.setSalary(teacher.getSalary()*(1+0.05));
             }

         }
         return BusyTeacher;

     }

}
