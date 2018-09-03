//https://alt.stepik.org/topics/lesson/63932
//Write a code that prints values of constants and results of invocation both methods in the following order: 
//A_CONSTANT_TTT, B_CONSTANT_QQQ, getMagicString(), convertStringToAnotherString("aa"). Each value must be printed in a new line.
package staticmembers;
class ConstantsAndUtilites {

    public static final String A_CONSTANT_TTT =""; // here is a value

    public static final String B_CONSTANT_QQQ =""; // here is another value

    public static String getMagicString() {
        return "";// a string
    }

    public static String convertStringToAnotherString(String s) {
        return "";// a string
    }

    public static void main(String args[]) {
        // write your code using the existing class ConstantsAndUtilites
        System.out.println(ConstantsAndUtilites.A_CONSTANT_TTT);
        System.out.println(ConstantsAndUtilites.B_CONSTANT_QQQ);
        System.out.println(ConstantsAndUtilites.getMagicString());
        System.out.println(ConstantsAndUtilites.convertStringToAnotherString("aa"));
    }
}
