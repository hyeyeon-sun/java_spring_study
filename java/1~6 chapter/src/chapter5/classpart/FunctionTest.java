package chapter5.classpart;

public class FunctionTest {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int sum = add(num1, num2);
        int sub = sub(num1, num2);
        int mult = mult(num1, num2);
        float devide = devide(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum + "입니다");
        System.out.println(num1 + " - " + num2 + " = " + sub + "입니다");
        System.out.println(num1 + " * " + num2 + " = " + mult + "입니다");
        System.out.println(num1 + " / " + num2 + " = " + devide + "입니다");
    }

    public static int add(int a, int b){
        int result = a + b;
        return result;
    }
    public static int sub(int a, int b){
        int result = a - b;
        return result;
    }
    public static int mult(int a, int b){
        int result = a * b;
        return result;
    }
    public static float devide(float a, float b){
        float result = a / b;
        return result;
    }
}
