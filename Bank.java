import java.util.ArrayList;

public class Bank {
    private String bankName;
    private String location;
    private ArrayList<Account> accounts;

    public Bank(String bankName, String location) {
        this.bankName = bankName;
        this.location = location;
        this.accounts = new ArrayList<>();
    }

    public void authorizeAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account authorized: " + accountNumber);
                return;
            }
        }
        System.out.println("Account not found: " + accountNumber);
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added to the bank: " + account.getAccountNumber());
    }

    public void manageTransaction(Transaction transaction) {
        System.out.println("Transaction recorded: " + transaction.getType() + " of amount " + transaction.getAmount());
    }
}
