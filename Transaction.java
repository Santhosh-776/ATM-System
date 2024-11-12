public class Transaction {
    private String date;
    private String type;
    protected int amount; // Use protected so subclasses can access it

    public Transaction(String date, String type, int amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public void printReceipt() {
        System.out.println("Transaction Receipt:");
        System.out.println("Date: " + date);
        System.out.println("Type: " + type);
        System.out.println("Amount: " + amount);
    }
}
