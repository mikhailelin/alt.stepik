package multidimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

//https://alt.stepik.org/topics/lesson/56025
public class Multidimensionalarray5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        int n_row=0;
        boolean find = false;
        int[] count=new int[n];
        for (int i = 0; i <n ; i++) {
            count[i]=0;
        }

        for (int i = 0; i < n; i++) {
            int max=0;
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==0){
                    max++;
                }else {
                    count[i]=(count[i]<max)?max:count[i];
                    max=0;
                }
                count[i]=(count[i]<max)?max:count[i];
            }
        }
        for (int i = 0; i <n ; i++) {
            if (count[i]>=k){
                find=true;
                n_row=i;
                break;
            }
        }
        System.out.println(Arrays.toString(count));
        System.out.println(find?n_row+1:0);
    }
}
