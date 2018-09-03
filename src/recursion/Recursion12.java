package recursion;
//https://alt.stepik.org/topics/lesson/65789
import java.util.Scanner;

public class Recursion12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(pow(2,n));
    }
    public static double pow(double a, long n) {
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return pow(a*a,n/2);
        }else{
            return a * pow(a, n - 1);
        }
    }
}
