package recursion;
//https://alt.stepik.org/topics/lesson/65816
import java.util.Scanner;

public class Recursion11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        System.out.println(comb(3,2));
    }
    public static int comb(int n, int k) {
        if(k==0){
            return 1;
        }
        if(k>n){
            return 0;
        }
        return comb(n-1,k)+comb(n-1,k-1);
    }

}
