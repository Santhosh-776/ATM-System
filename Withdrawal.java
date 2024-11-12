public class Withdrawal extends Transaction {
    private String accountNumber;

    public Withdrawal(String date, int amount, String accountNumber) {
        super(date, "Withdrawal", amount);
        this.accountNumber = accountNumber;
    }

    public int withdrawAmount(int currentBalance) throws InsufficientBalanceException {
        if (super.amount > currentBalance) {
            throw new InsufficientBalanceException("Withdrawal amount exceeds current balance.");
        }
        return currentBalance - super.amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
