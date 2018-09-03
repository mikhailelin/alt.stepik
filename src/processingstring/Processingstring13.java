package processingstring;
//https://alt.stepik.org/topics/lesson/56008
import java.util.Scanner;

public class Processingstring13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String c = scanner.next();
        int count =0;
        for (int i = 0; i <str.length() ; i++) {
            if(c.equals(str.substring(i,i+1))){
                count++;
            }
        }
        System.out.print(count);
    }
}
