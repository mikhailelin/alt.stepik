package definingmethods;
//https://alt.stepik.org/topics/lesson/60429
public class Definingmethods9 {
    public static void main(String[] args){
        System.out.println(getNumberOfMaxParam(12,3,12));
    }
    public static int getNumberOfMaxParam(int a, int b, int c) {
        // write a body here
        return (a>=b)?(a>=c?1:3):(b>=c?2:3);
    }
}
