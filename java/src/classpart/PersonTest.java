package classpart;

public class PersonTest {
    public static void main(String[] args) {
        Person James = new Person();
        James.name = "James";
        James.age = 40;
        James.Is_merried = true;
        James.numOfChild = 3;
        System.out.println(James.getAge());
        System.out.println(James.getName());
        System.out.println(James.getIsMerried());
        System.out.println(James.getNumOfChild());
    }
}
