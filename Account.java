public class Account {
    private String accountNumber;
    private String bankName;
    private int balance;

    public Account(String accountNumber, String bankName, int balance) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
    }

    public void cashWithdrawal(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void cashDeposit(int amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void miniStatement() {
        System.out.println("Generating mini statement...");
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}