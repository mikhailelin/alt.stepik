package multidimensionalarray;
//https://alt.stepik.org/topics/lesson/56019
import java.util.Scanner;

public class Multidimensionalarray7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] arr = new int[n][k];
        int max=0, max_i=0,max_j=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                arr[i][j] = scanner.nextInt();
                if((max<arr[i][j])||(i==0&&j==0)){
                    max=arr[i][j];
                    max_i=i;
                    max_j=j;
                }
            }
        }
        System.out.println(max_i+" "+max_j);
    }
}
