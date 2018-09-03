package definingmethods;
//https://alt.stepik.org/topics/lesson/56048
public class Definingmethods14 {
    public static void main(String[] args){
        int[] ee ={3,1,2};
        sort(ee);
        for (int i = 0; i <ee.length ; i++) {
            System.out.print(ee[i]+" ");
        }
        printNumberOfArguments();
        method(1, 2);
        method(new int[] { 1, 2, 3 });
        method(1);
        method(new int[] { });
        method(new int[] { 100 });
        method(null);
        method();
    }
    public static void sort(int[] numbers) {

        for (int i = numbers.length-1; i >=0; i--) {
        }
        int k,x;
        for( int i=0; i < numbers.length; i++) {   	// i - номер текущего шага
            k=i; x=numbers[i];

            for( int j=i+1; j < numbers.length; j++)	// цикл выбора наименьшего элемента
                if (  numbers[j] < x ) {
                    k=j; x=numbers[j];	        // k - индекс наименьшего элемента
                }

            numbers[k] = numbers[i]; numbers[i] = x;   	// меняем местами наименьший с a[i]
        }
    }

    public static void printNumberOfArguments(int... numbers) {
        System.out.println(numbers.length);
    }
    public static void method(int... vararg) { /* do something */ }
}
