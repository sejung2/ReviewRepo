package hairsalonsystem.domain.account;

public class Account {
    private int balance = 0;
    static private Account instance;

    private Account(int balance) {
        this.balance = balance;
    }

    static public Account getInstance() {
        if (instance == null) {
            instance = new Account(0);
        }
        return instance;
    }

    public int getBalance() {
        return balance;
    }
}
