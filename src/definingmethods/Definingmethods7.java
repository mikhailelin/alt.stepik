package definingmethods;
//https://alt.stepik.org/topics/lesson/60433
public class Definingmethods7 {
    public static void main(String[] args){
        System.out.println(isComposite(21));
    }
    public static boolean isComposite(long number) {
        // write your code here
        for (int i = 2; i <=number/i ; i++) {
            if(number%i==0)return true;
        }
        return false;
    }
}
