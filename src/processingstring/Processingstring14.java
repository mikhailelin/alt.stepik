package processingstring;

import java.util.Scanner;
//https://alt.stepik.org/topics/lesson/56009
public class Processingstring14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 =scanner.nextLine();
        int count =0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.indexOf(str1,i)>=0){
                count++;
                i=i+str.indexOf(str1,i);
            }
        }
        System.out.println(count);

    }
}
