package overloading;
//https://alt.stepik.org/topics/lesson/60541
public class Overloading9 {
    public static void main(String[] args){
        System.out.println(getMaxMinusCurrent(10l));
        System.out.println(getMaxMinusCurrent(10));
        System.out.println(getMaxMinusCurrent((short)10));
    }
    public static long getMaxMinusCurrent(long val) {
        return Long.MAX_VALUE - val;
    }
    public static int getMaxMinusCurrent(int val) {
        return Integer.MAX_VALUE-val;
    }
    public static short getMaxMinusCurrent(short val) {
        return (short) (Short.MAX_VALUE-val);
    }
}
