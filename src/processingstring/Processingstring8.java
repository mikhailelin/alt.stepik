package processingstring;

import java.util.Scanner;

//https://alt.stepik.org/topics/lesson/56005
public class Processingstring8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count =0;
        int i=0;
        while (i<str.length()) {
            /*if(str.indexOf("ab", i)>=0){
                count++;
                i=str.indexOf("ab", i)+1;
            }else {
                i++;
            }*/
            count = (str.indexOf("ab", i)>=0)?++count:count;
            i=(str.indexOf("ab", i)>=0)?str.indexOf("ab", i)+1:++i;
        }
        System.out.println(count);
    }
}
