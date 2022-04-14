package chapter4;

public class gugudan {
    public static void main(String[] args){
        for (int i = 3; i<=7; i++){
            System.out.println(i + "단 시작");
            for(int j = 1; j <=9; j++){
                System.out.println(i + "x" + j + "=" + i*j);
            }
        }
    }
}
