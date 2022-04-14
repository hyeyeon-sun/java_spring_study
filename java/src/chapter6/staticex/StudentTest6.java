package chapter6.staticex;

public class StudentTest6 {
    public static void main (String[] args) {
        Student3 studentLee = new Student3();
        studentLee.setStudentName("이지원");
        System.out.println(studentLee.getCardNum());

        Student3 studentSon = new Student3();
        studentSon.setStudentName("손수경");
        System.out.println(studentSon.getCardNum());
    }

}
