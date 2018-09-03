package processingstring;

import java.util.Scanner;
//https://alt.stepik.org/topics/lesson/56015
public class Processingstring10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.substring(i,i+1)+str.substring(i,i+1));
        }

    }
}
