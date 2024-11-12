public class Bank {
    private String bankName;
    private String location;

    public Bank(String bankName, String location) {
        this.bankName = bankName;
        this.location = location;
    }

    public void authorizeAccount(String accountNumber) {
        System.out.println("Authorizing account: " + accountNumber);
    }

    public String getBankName() {
        return bankName;
    }
}