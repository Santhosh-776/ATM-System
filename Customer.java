public class Customer {
    private String name;
    private int phoneNumber;
    private String emailId;
    private String userId;

    public Customer(String name, int phoneNumber, String emailId, String userId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.userId = userId;
    }

    public void selectOptions(String option) {
        System.out.println("Option selected: " + option);
    }

    public void updateInformation(String newInfo) {
        System.out.println("Customer information updated to: " + newInfo);
    }

    public void depositOrWithdraw(int amount) {
        System.out.println("Processing amount: " + amount);
    }
}
