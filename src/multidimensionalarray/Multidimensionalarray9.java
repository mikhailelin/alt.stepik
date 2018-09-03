package multidimensionalarray;

import java.util.Scanner;
//https://alt.stepik.org/topics/lesson/56026
public class Multidimensionalarray9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = j;
            }
        }
    }
}
