package definingmethods;
//https://alt.stepik.org/topics/lesson/60423
public class Definingmethods10 {
    public static void main(String[] args){
        System.out.println(extractInt(3.55));

    }
    public static int extractInt(double d) {
        // write a body here
        return (int) Math.floor(d);
    }
}
