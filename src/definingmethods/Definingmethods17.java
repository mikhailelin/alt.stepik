package definingmethods;
//https://alt.stepik.org/topics/lesson/60434
public class Definingmethods17 {
    public static void main(String[] args){
        System.out.println(sign(-2));
    }
    public static int sign(int number) {
        // write your code here
        return (number==0)?0:(number>0?1:-1);
    }
}
