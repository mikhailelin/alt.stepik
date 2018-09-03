package processingstring;
//https://alt.stepik.org/topics/lesson/56014
import java.util.Scanner;

public class Processingstring12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int offset = scanner.nextInt();
        if(offset<str.length()) {
            System.out.print(str.substring(offset) + str.substring(0, offset));
        }else {
            System.out.println(str);
        }
    }
}
