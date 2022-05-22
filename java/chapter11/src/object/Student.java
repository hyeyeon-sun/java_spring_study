package object;

public class Student {
    int studentID;
    String name;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.studentID + "," + this.name;
    }
}
