import java.util.Scanner;
//https://alt.stepik.org/topics/lesson/56010
public class Processingstrings18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        char[] str_arr = str1.toCharArray();
        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        int count =0;
        for (int i = 0; i <str_arr.length ; i++) {
            if(a==str_arr[i]){
                for (int j = i+1; j <str_arr.length ; j++) {
                    if(b==str_arr[j]){
                        count++;
                        //i=j-1;
                        break;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
