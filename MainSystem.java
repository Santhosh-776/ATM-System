import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create instances
        Bank bank = new Bank("MyBank", "New York");
        ATM atm = new ATM("New York", "MyBank");
        atm.setPIN(1234); // Set a default PIN for simulation

        Customer customer = new Customer("John Doe", 1234567890, "john.doe@example.com", "CUST123");
        Account account = new Account("123456789", "MyBank", 5000);

        System.out.println("Welcome to MyBank ATM!");

        // Validate PIN
        System.out.print("Enter your PIN: ");
        int enteredPIN = scanner.nextInt();
        if (!atm.validatePin(enteredPIN)) {
            System.out.println("Invalid PIN. Exiting.");
            return;
        }

        // Display options
        while (true) {
            atm.displayOptions();
            System.out.print("Choose an option (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Withdraw
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmount = scanner.nextInt();
                    account.cashWithdraw(withdrawAmount);
                    break;

                case 2: // Deposit
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = scanner.nextInt();
                    account.cashDeposit(depositAmount);
                    break;

                case 3: // Mini Statement
                    account.miniStatement();
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }

            // Another transaction?
            System.out.print("Perform another transaction? (yes/no): ");
            String anotherTransaction = scanner.next();
            if (!anotherTransaction.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for using MyBank ATM!");
                break;
            }
        }

        scanner.close();
    }
}
