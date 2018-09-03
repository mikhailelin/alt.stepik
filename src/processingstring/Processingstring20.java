package processingstring;

import java.util.Scanner;

//https://alt.stepik.org/topics/lesson/56012
public class Processingstring20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        char[] chr_arr= str.toCharArray();
        int count =0;
        for (int i = 0; i <chr_arr.length ; i++) {
            if(chr_arr[i]=='g'||chr_arr[i]=='c'){
                count++;
            }
        }
        System.out.print(100.0*count/chr_arr.length);
    }
}
