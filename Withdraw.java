import java.sql.Date;
public class Withdraw extends Transaction {
    private String accountNumber;

    public Withdraw(Date date, int amount, String accountNumber) {
        super(date, "Withdraw", amount);
        this.accountNumber = accountNumber;
    }
}