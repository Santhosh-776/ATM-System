public class Deposit extends Transaction {
    private String accountNumber;

    public Deposit(String date, int amount, String accountNumber) {
        super(date, "Deposit", amount);
        this.accountNumber = accountNumber;
    }
}
