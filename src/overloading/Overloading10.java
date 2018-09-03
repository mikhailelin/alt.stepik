package overloading;
//https://alt.stepik.org/topics/lesson/56050
public class Overloading10 {
    public static void main(String[] args){
        print("test");
        print("test", 4);
    }

    public static void print(String strArg) {
        System.out.println(String.format("print(\"%s\")", strArg));
    }
    public static void print(String strArg, int i) {
        System.out.println(String.format("print(\"%s\", %d)", strArg,i));
    }
}
