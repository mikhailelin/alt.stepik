import java.util.Scanner;
//https://alt.stepik.org/topics/lesson/56011
public class Processingstrings19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        char[] str_arr = str1.toCharArray();
        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        int countA =0;
        int countB = 0;
        for (int i = 0; i <str_arr.length ; i++) {
            if(a==str_arr[i]){
                countA++;
            }
            if(b==str_arr[i]){
                countB++;
            }
        }
        if(countA==0 ||countB==0){
            System.out.println(0);
        }else {
            System.out.println((countA > countB ? countA : countB));
        }

    }
}
