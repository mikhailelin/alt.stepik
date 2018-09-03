package arrays_as_parameters;
//https://alt.stepik.org/topics/lesson/60518
import java.util.Arrays;

public class Arrays_as_parameters8 {
    public static void main(String[] args){
        boolean[] bools = {false,false,true};
        inverseFlags(bools);
        System.out.println(Arrays.toString(bools));
    }
    public static void inverseFlags(boolean ... bools) {
        // write a body here
        for (int i = 0; i <bools.length; i++) {
            bools[i]=bools[i]?false:true;
        }
    }
}
