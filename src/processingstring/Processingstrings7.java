import java.util.Scanner;
//https://alt.stepik.org/topics/lesson/56017
public class Processingstrings7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String[] str_arr = str1.split("-");
        int x =0;
        for (int i = 0; i <str_arr.length ; i++) {
            x=Integer.parseInt(str_arr[i]);
            if(x==0||(i==2&&x>31)||(i==1&&x>12)) {
                System.out.println("Incorrect input");
                return;
            }
        }
        for (int i = 0; i <3; i++) {
            if(i==2){
                System.out.print(str_arr[0]);
                break;
            }
            System.out.print(str_arr[i+1]);
            System.out.print("/");

        }
    }
}
