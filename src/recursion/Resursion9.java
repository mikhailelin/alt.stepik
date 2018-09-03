package recursion;
//https://alt.stepik.org/topics/lesson/65786
import java.util.Scanner;

public class Resursion9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str =scanner.nextLine();
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) { // (1)
            return true; // (2)
        }

        int lastIndex = s.length() - 1; // (3)
        boolean r = s.charAt(0) == s.charAt(lastIndex); // (4)

        return r && isPalindrome(s.substring(1, lastIndex)); // (5)
    }
}
