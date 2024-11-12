public class Customer {
    private String name;
    private int phoneNumber;
    private String emailID;
    private String userID;

    public Customer(String name, int phoneNumber, String emailID, String userID) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailID = emailID;
        this.userID = userID;
    }

    public void updateInformation(String newInfo) {
        System.out.println("Information updated: " + newInfo);
    }

    public void selectOptions(String option) {
        System.out.println("Option selected: " + option);
    }
}