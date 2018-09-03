import java.util.Scanner;
//https://alt.stepik.org/topics/lesson/56002
public class Processingstring17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        char[] str_arr = str1.toCharArray();
        int sum1=0;
        int sum2=0;
        for (int i = 0; i <3 ; i++) {
            sum1=sum1+str_arr[i];
        }
        for (int i = 3; i <6 ; i++) {
            sum2=sum2+str_arr[i];
        }
        System.out.println((sum1==sum2?"Lucky":"Regular"));

    }
}
