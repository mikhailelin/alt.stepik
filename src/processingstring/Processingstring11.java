package processingstring;

import java.util.Scanner;
//https://alt.stepik.org/topics/lesson/56007
public class Processingstring11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print(str.toLowerCase().indexOf("the"));
    }
}
