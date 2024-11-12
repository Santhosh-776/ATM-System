public class Withdrawal extends Transaction {
    private String accountNumber;

    public Withdrawal(String date, int amount, String accountNumber) {
        super(date, "Withdrawal", amount);
        this.accountNumber = accountNumber;
    }

    public int getBalance(int currentBalance) {
        return currentBalance - super.amount;
    }
}
