package multidimensionalarray;

import java.util.Scanner;

//https://alt.stepik.org/topics/lesson/56020
public class Multidimensionalarray14 {
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

        //System.out.println(Arrays.toString(arr[0]));
        //System.out.println(Arrays.toString(arr[1]));
        for (int j = 0; j <k ; j++) {
            for (int i = 0; i <n ; i++) {
                System.out.print(arr[i][j]+" ");
            }
            //System.out.println();
        }

    }
}
