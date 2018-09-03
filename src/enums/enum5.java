//https://alt.stepik.org/topics/lesson/56077
package enums;
/**
 * The method change the balance of the given account according to an operation.
 * @param //account
 * @param //operation
 * @return true if the balance has changed, otherwise - false.
 */
/*
public static boolean changeBalance(Account account, Operation operation, Long sum) {
    // write your implementation here
    if(operation == Operation.DEPOSIT){
        account.setBalance(account.getBalance()+sum);
        return true;
    }
    if(operation == Operation.WITHDRAW){
        if(account.getBalance()-sum<0){
            System.out.println("Not enough money to withdraw.");
            return false;
        }
        account.setBalance(account.getBalance()-sum)
        return true;
    }
	return false;
}

*/
enum Operation {
    /**
     * deposit (add) an amount into an Account
     */
    WITHDRAW,
    /**
     * withdraw (subtract) an amount from an Account
     */
    DEPOSIT
}
/*
static class Account {

    private String code;
    private Long balance;

    public String getCode() {
        return code;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
*/