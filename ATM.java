public class ATM {
    private int PIN;
    private String location;
    private String bankName;

    public ATM(String location, String bankName) {
        this.location = location;
        this.bankName = bankName;
    }

    public boolean validatePin(int inputPIN) {
        return this.PIN == inputPIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public void displayOptions() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Mini Statement");
    }

    public void selectLanguage(String language) {
        System.out.println("Language selected: " + language);
    }
}
