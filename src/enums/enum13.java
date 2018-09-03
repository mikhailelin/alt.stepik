//https://alt.stepik.org/topics/lesson/63316
package enums;

public class enum13 {

    public static void main(String[] args) {
        Secret[] enum_arr = Secret.values();
        int count=0;
        for(int i=0;i<enum_arr.length;i++){
            String temp=enum_arr[i].toString();
            if(temp.substring(0,4).equals("STAR")){count++;}
        }
        System.out.println(count);
        for(int i=0; i<10-0;i++){
            System.out.println(i);
        }
    }
}


enum Secret { 
    STAR, CRASH, STAR1 // ...
} 


