public class ATM {
     private int PIN;
     private String location;
     private String bankName;
 
     public ATM(int PIN, String location, String bankName) {
         this.PIN = PIN;
         this.location = location;
         this.bankName = bankName;
     }
 
     public boolean validatePin(int enteredPIN) {
         return this.PIN == enteredPIN;
     }
 
     public void selectLanguage(String language) {
         System.out.println("Language selected: " + language);
     }
 
     public void displayOptions() {
         System.out.println("Options: Withdraw, Deposit, Mini Statement, Balance Inquiry");
    }
 }
 