package definingmethods;
//https://alt.stepik.org/topics/lesson/56047
public class Definingmethods13 {
    public static void main(String[] args){
        System.out.println(reverse("java", "programming", "methods")[0]);

    }
    private static String[] reverse(String... words) {
        int n =words.length;
        String[] arr = new  String[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=words[n-1-i];
        }
        return arr;
    }

}
