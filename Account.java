import java.util.ArrayList;

public class Account {
    private String accountNumber;
    private String bankName;
    private int balance;
    private ArrayList<Transaction> transactions;

    public Account(String accountNumber, String bankName, int balance) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void accountSelection(String accountType) {
        System.out.println("Account selected: " + accountType);
    }

    public void cashWithdraw(int amount) throws InsufficientBalanceException, InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        Transaction transaction = new Withdrawal("2024-11-12", amount, accountNumber);
        transactions.add(transaction);
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public void cashDeposit(int amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        Transaction transaction = new Deposit("2024-11-12", amount, accountNumber);
        transactions.add(transaction);
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void miniStatement() {
        System.out.println("Mini Statement for account: " + accountNumber);
        for (Transaction transaction : transactions) {
            System.out.println(transaction.getType() + " of " + transaction.getAmount() + " on " + transaction.getDate());
        }
        System.out.println("Current balance: " + balance);
    }
}
