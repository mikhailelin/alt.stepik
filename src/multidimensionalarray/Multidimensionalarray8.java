package multidimensionalarray;

import java.util.Scanner;
//https://alt.stepik.org/topics/lesson/56022
public class Multidimensionalarray8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] arr = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j <k ; j++) {
            for (int i = n-1; i >=0 ; i--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
