package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student (String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double gradeTotal = 0;
        for(int grade : grades) {
            gradeTotal += grade;
        }
        return gradeTotal / grades.size();
    }

    public static void main(String[] args) {
        Student test = new Student("Test");
        System.out.println("test.getName() = " + test.getName());
        test.addGrade(99);
        test.addGrade(89);
        System.out.println("test.getGradeAverage() = " + test.getGradeAverage());
    }
}
