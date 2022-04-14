package chapter5.test;

import chapter5.hiding.Student;

public class StudentTest {
    public static void main(String[] args){
        Student Lee = new Student();
        Lee.setStudentName("이혜연");
        Lee.studentID = 23;
        System.out.println(Lee.getStudentName());
        System.out.println(Lee.studentID);
    }
}
