public class Transaction {
    private String date;
    private String type;
    private int amount;

    public Transaction(String date, String type, int amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public void printReceipt() {
        System.out.println("Transaction Receipt:");
        System.out.println("Date: " + date);
        System.out.println("Type: " + type);
        System.out.println("Amount: " + amount);
    }
}
