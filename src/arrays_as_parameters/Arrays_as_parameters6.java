package arrays_as_parameters;
//https://alt.stepik.org/topics/lesson/60649
import java.util.Arrays;

public class Arrays_as_parameters6 {
    public static void main(String[] args){
        int[] arr={1,2,3};
        System.out.println(Arrays.toString(getFirstAndLast(arr)));
    }
    public static int[] getFirstAndLast(int[] arr){
        int[] arr1 = new int[2];
        arr1[0]=arr[0];
        arr1[1]=arr[arr.length-1];
        return arr1;

    }
}
