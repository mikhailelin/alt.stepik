package processingstring;

import java.util.Scanner;
//https://alt.stepik.org/topics/lesson/56004
public class Processingstring15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1="";
        for (int i = str.length()-1; i>=0 ; i--) {
            str1=str1+str.substring(i,i+1);
        }
        System.out.print((str.equals(str1)?"yes":"no"));
    }
}
