package recursion;

//https://alt.stepik.org/topics/lesson/65739
//https://alt.stepik.org/topics/lesson/65740
//https://alt.stepik.org/topics/lesson/65755
public class Recursion14 {
    public static void main(String[] args){
        System.out.println(method(7l));
        System.out.println(method(8));
        System.out.println(method3(29815l));
    }
    public static long method(long n) {
        if (n <= 1) {
            return n;
        }
        return n + method(n - 1) - 1;
    }
    public static int method(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * method(n - 1);
        }
    }
    public static long method3(long n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + method3(n / 10);
    }
}
