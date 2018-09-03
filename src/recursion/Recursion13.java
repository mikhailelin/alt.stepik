package recursion;
//https://alt.stepik.org/topics/lesson/65831
import java.util.Scanner;
public class Recursion13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        method(n,n);
    }
    public static int  method(int n, int k){
        int x=0;
        int y=0;
        if(n==1 || k==1){
            System.out.println(1);
            return 1;
        }
        if(n<=k){
            x=method(n,n-1)+1;
            System.out.print(x+" ");
            return x;
        }
        x=method(n,k-1);
        y=method(n-k,k);
        System.out.print(x+" "+y+" ");
        return x+y;

    }
}
