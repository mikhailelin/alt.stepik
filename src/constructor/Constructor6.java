package constructor;
//https://alt.stepik.org/topics/lesson/63563
public class Constructor6 {
}
class Account{
    long balance;
    String ownerName;
    boolean locked;
    public Account(long balance, String ownerName, boolean locked){
        this.balance=balance;
        this.ownerName=ownerName;
        this.locked=locked;
    }
}

