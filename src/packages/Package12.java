package packages;

import java.util.Scanner;

//https://alt.stepik.org/topics/lesson/56065
public class Package12 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int n = 5; //scanner.nextInt();
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(callBinarySearch(arr,n));


    }
    public static int callBinarySearch(int[] nums, int key) {
        return java.util.Arrays.binarySearch(nums,key);
    }
}
