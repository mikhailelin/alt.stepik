package multidimensionalarray;

import java.util.Scanner;
//https://alt.stepik.org/topics/lesson/56021
public class Multidimensionalarray6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr= new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                arr[i][j]=j-i;
                arr[j][i]=j-i;
            }
        }
        for (int i = 0; i < n; i++) {
            //System.out.println(Arrays.toString(arr[i]));
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
