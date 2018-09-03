package definingmethods;
//https://alt.stepik.org/topics/lesson/60432
public class Definingmethods6 {
    public static void main(String[] args){
        System.out.println(factorial(10));
    }
    public static long factorial(long n) {
        // write your code here
        long fac=1;
        for(long i=1;i<=n;i++){
            fac*=i;
        }
        return fac;
    }
}
