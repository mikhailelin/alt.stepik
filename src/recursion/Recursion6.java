package recursion;

import java.util.Scanner;

//https://alt.stepik.org/topics/lesson/65788
public class Recursion6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }

    public static long fib(long n){
        if (n <= 1) {
            return n;
        }
        return fib(n - 2) - fib(n - 1);
    }
}
