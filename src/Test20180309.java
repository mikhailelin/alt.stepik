public class Test20180309 {
    public static void main(String[] args){
        System.out.print(ENUM1.A);
        double[] arr = new double[1];
        int i = 2;
        arr[--i] = 1d / --i;
    }
}
enum ENUM1{
    A(1),B(2),C(3);
    ENUM1(int i){
        System.out.print(i);
    }
    static {
        System.out.print("static");
    }
}
