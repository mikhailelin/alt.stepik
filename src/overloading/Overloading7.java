package overloading;
//https://alt.stepik.org/topics/lesson/56052
public class Overloading7 {
    public static void main(String[] args){
        int[] arr = {6,2,4,5,6};
        System.out.println(findIndexOfMaxInArray(arr));
        System.out.println(findIndexOfMaxInArray(arr, false));
    }
    public static int findIndexOfMaxInArray(int[] array, boolean findFirst) {
        // write your implementation here
        int max = array[0];
        int index = 0;
        for (int i = 1; i <array.length ; i++) {
            if(findFirst?(max<array[i]):(max<array[i]||max==array[i])){
                max=array[i];
                index=i;
            }
        }
        return index;
    }

    public static int findIndexOfMaxInArray(int[] array) {
        // write your implementation here
        return findIndexOfMaxInArray(array, true);
    }
}
