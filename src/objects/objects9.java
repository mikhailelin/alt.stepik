package objects;

public class objects9 {
    public static String prepareFullName(String firstName, String lastName) {
        if(firstName==null)return lastName;
        if(lastName==null)return firstName;
        return (firstName+" "+lastName);

    }

}
