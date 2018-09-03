package recursion;
//https://alt.stepik.org/topics/lesson/65781
import java.util.Scanner;

public class Recursion8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDollars(n);
    }
    public static void printDollars(int n) {
        if (n > 1) {
            printDollars(n - 1);
        }

        for (int i = 0; i < n; i++) {
            System.out.print("$");
        }
    }
}
