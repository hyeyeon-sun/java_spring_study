package chapter6.staticex;

public class Student3 {
    private static int serialNum = 1000;
    private static int cardNum;
    public int studentID;
    public String studentName;
    public int grade;
    public String address;

    public Student3() {
        serialNum++;
        studentID = serialNum;
        cardNum = studentID+100;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student3.serialNum = serialNum;
    }

    public static int getCardNum() {
        return cardNum;
    }
}
