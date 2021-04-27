package task1;

import java.util.ArrayList;
import java.util.List;

public class PortalCredentialsCreator {
    public List<UserName> createListOfUserNames(List<Student> studentsList) {
        List<UserName> userNameList = new ArrayList<>();
        for (Student student : studentsList) {
            byte currentYear = student.getCurrentYear();
            byte rollNumber = student.getRollNumber();
            String firstName = student.getFirstName();
            String lastName = student.getLastName();
            String userName = String.format("%d%d%s%s",currentYear,rollNumber,firstName,lastName);
            UserName userName1 = new UserName(userName);
            userNameList.add(userName1);

        }
        return userNameList;
    }

}
