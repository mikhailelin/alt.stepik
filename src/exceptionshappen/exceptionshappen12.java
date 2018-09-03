package exceptionshappen;
//https://alt.stepik.org/topics/lesson/57476

import java.util.Scanner;
import java.lang.NullPointerException;
import java.lang.ClassNotFoundException;

public class exceptionshappen12 {
}
class FixingArithmeticException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(b!=0){
            System.out.println(a / b);
        }else{
            System.out.println("Division by zero!");
        }
    }
}