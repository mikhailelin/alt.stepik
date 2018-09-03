package recursion;
//https://alt.stepik.org/topics/lesson/65787
import java.util.Scanner;

public class Recursion10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str =scanner.nextLine();
        printReverseCharByChar(str);
    }
    public static void printReverseCharByChar(String s) {
        if (s.length() > 0) {
            int last = s.length() - 1;
            System.out.print(s.charAt(last));
            printReverseCharByChar(s.substring(0, last));
        }
    }
}
