public class Checkings extends Account {
    public Checkings(String accountNumber, String bankName, int balance) {
        super(accountNumber, bankName, balance);
    }

    public void operation(String operationType) {
        System.out.println("Checkings account operation: " + operationType);
    }
}
