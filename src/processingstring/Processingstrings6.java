import java.util.Scanner;
import java.util.*;
public class Processingstrings6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        char[] arr_ch = str1.toCharArray();
        int n=1;
        char ch_temp = arr_ch[0];
        String str_temp =String.valueOf(ch_temp);
        for (int i = 1; i <arr_ch.length ; i++) {
            if(ch_temp==arr_ch[i]){
                n++;
            }else {
                str_temp=str_temp+n+arr_ch[i];
                ch_temp=arr_ch[i];
                n=1;
            }
        }
        str_temp=str_temp+n;
        System.out.println(str_temp);
    }
}
