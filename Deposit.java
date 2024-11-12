import java.sql.Date;
public class Deposit extends Transaction {
    private String accountNumber;

    public Deposit(Date date, int amount, String accountNumber) {
        super(date, "Deposit", amount);
        this.accountNumber = accountNumber;
    }
}