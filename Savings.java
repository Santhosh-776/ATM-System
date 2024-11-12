public class Savings extends Account {
    public Savings(String accountNumber, String bankName, int balance) {
        super(accountNumber, bankName, balance);
    }

    public void operation(String operationType) {
        System.out.println("Savings account operation: " + operationType);
    }
}
