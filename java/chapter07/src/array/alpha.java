package array;

public class alpha {
    public static void main(String[] args){
        char[][] alpha = new char[13][2];

        char al = 'a';

        for(int i = 0; i<13; i++){
            for(int j = 0; j<2; j++, al++){
                alpha[i][j] = al;
            }
        }

        for(int i = 0; i<13; i++){
            System.out.println(alpha[i][0] + " " + alpha[i][1]);
        }
    }
}
