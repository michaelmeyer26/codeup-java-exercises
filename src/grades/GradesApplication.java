package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student brandun = new Student("Brandun");
        brandun.addGrade(80);
        brandun.addGrade(90);
        brandun.addGrade(78);

        Student al = new Student("Al Correct");
        al.addGrade(100);
        al.addGrade(100);
        al.addGrade(100);

        Student idkMan = new Student("Idk Man");
        idkMan.addGrade(85);
        idkMan.addGrade(76);
        idkMan.addGrade(79);

        students.put("breadun", brandun);
        students.put("Ackshually42", al);
        students.put("thisismyusername999", idkMan);

        System.out.println("Welcome!\n\nHere are the Github usernames of our students: \n\n");
        for (String studentName : students.keySet()) {
            System.out.printf("|%s| ", studentName);
        }
        System.out.println();
        getStudent(students);
    }

    public static void getStudent(HashMap<String, Student> students) {
        Scanner sc = new Scanner(System.in);
        boolean getStudentInfo = true;
        do {
            System.out.print("What student would you like to see more information on?\n> ");
            String username = sc.nextLine();
            if (students.containsKey(username)) {
                System.out.printf("Name: %s - Github Username: %s\nCurrent Average: %f\n", students.get(username).getName(), username, students.get(username).getGradeAverage());
            } else {
                System.out.printf("Sorry, no student found with the username of \"%s\"\n", username);
            }
            System.out.print("Would you like to see another student? [y/n]\n> ");
            getStudentInfo = Input.yesNo();
        } while (getStudentInfo);
        System.out.println("Goodbye, and have a wonderful day!");
    }
}
