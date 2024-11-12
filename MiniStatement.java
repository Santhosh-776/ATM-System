import java.sql.Date;
public class MiniStatement extends Transaction {
    private String accountNumber;

    public MiniStatement(Date date, String accountNumber) {
        super(date, "Mini Statement", 0);
        this.accountNumber = accountNumber;
    }

    public void generateStatement() {
        System.out.println("Generating mini statement for account: " + accountNumber);
    }
}