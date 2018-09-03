package arrays_as_parameters;
//https://alt.stepik.org/topics/lesson/60648
import java.util.Arrays;

public class Arrays_as_parameters5 {
    public static void main(String[] args){
        long[] arr={1,2,3};
        addValueByIndex(arr,2,5);
        System.out.println(Arrays.toString(arr));
    }
    public static void addValueByIndex(long[] arr, int  index, long value){
        arr[index]=arr[index]+value;

    }
}
