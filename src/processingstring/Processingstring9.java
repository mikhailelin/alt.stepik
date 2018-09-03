package processingstring;

import java.util.Scanner;
//https://alt.stepik.org/topics/lesson/56016
public class Processingstring9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(str.length()<3) return;
        int index = str.length()/2;
        if(str.length()%2==0){
            System.out.println(str.substring(0,index-1)+str.substring(index+1));
        }else {
            System.out.println(str.substring(0, index) + str.substring(index + 1));
        }

    }
}
