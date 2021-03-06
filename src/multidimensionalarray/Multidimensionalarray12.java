package multidimensionalarray;

import java.util.Scanner;

//https://alt.stepik.org/topics/lesson/56018
public class Multidimensionalarray12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        String str="YES";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]!=arr[j][i]){
                    str="NO";
                    break;
                }
            }
            if(str.equals("NO"))break;
        }
        System.out.println(str);
    }
}
