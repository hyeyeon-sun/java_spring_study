package chapter5.hiding;

public class Student {
    public int studentID;
    private String studentName;
    public int grade;
    public String address;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
