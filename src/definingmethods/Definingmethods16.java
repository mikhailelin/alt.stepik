package definingmethods;
//https://alt.stepik.org/topics/lesson/56046
public class Definingmethods16 {
    public static void main(String[] args){
        System.out.println(sumInRange(1,2));
    }
    /**
     * The method calculates the sum of integers in a given range
     *
     * @param from inclusive
     * @param to exclusive
     *
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        long acc = 0;
        for (int i = from; i <to; i++) {
            acc += i;
        }
        return (from==to)?from:acc;
    }
}
