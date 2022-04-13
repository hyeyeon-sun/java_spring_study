package chapter2;

public class CharacterEx1 {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);

        char ch2 = 66;
        System.out.println(ch2);
        // char 형에 숫자를 대입할 수도 있고, 그러면 문자로 알아서 나온다.

        int ch3 = 'A';
        System.out.println(ch3);
        System.out.println((char)ch3);
        // int 형에 문자를 대입할 수도 있고, 그럼 숫자로 알아서 나온다.
    }
}
