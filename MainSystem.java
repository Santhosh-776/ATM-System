import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank("VEGA7", "Vellore");
        ATM atm = new ATM("Vellore", "VEGA7");
        atm.setPIN(1234); 

        Account savingsAccount = new Savings("123456789", "VEGA7", 5000);
        Account checkingAccount = new Checkings("987654321", "VEGA7", 3000);
        bank.addAccount(savingsAccount);
        bank.addAccount(checkingAccount);

        System.out.println("Welcome to VEGA7 ATM!");

        boolean isAuthenticated = false;
        while (!isAuthenticated) {
            try {
                System.out.print("Enter your PIN: ");
                int enteredPIN = scanner.nextInt();
                if (!atm.validatePin(enteredPIN)) {
                    throw new InvalidPINException("Invalid PIN. Please try again.");
                }
                isAuthenticated = true;
            } catch (InvalidPINException e) {
                System.out.println(e.getMessage());
            }
        }

        Account selectedAccount = null;
        while (selectedAccount == null) {
            try {
                System.out.println("Select Account Type: 1. Savings 2. Checking");
                int accountTypeChoice = scanner.nextInt();
                if (accountTypeChoice == 1) {
                    selectedAccount = savingsAccount;
                } else if (accountTypeChoice == 2) {
                    selectedAccount = checkingAccount;
                } else {
                    throw new InvalidTransactionException("Invalid account type selected.");
                }
            } catch (InvalidTransactionException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            atm.displayOptions();
            System.out.print("Choose an option (1-3): ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1: 
                        System.out.print("Enter withdrawal amount: ");
                        int withdrawAmount = scanner.nextInt();
                        selectedAccount.cashWithdraw(withdrawAmount);
                        break;

                    case 2: 
                        System.out.print("Enter deposit amount: ");
                        int depositAmount = scanner.nextInt();
                        selectedAccount.cashDeposit(depositAmount);
                        break;

                    case 3: 
                        selectedAccount.miniStatement();
                        break;

                    default:
                        System.out.println("Invalid option. Try again.");
                        break;
                }
            } catch (InsufficientBalanceException | InvalidTransactionException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Perform another transaction? (yes/no): ");
            String anotherTransaction = scanner.next();
            if (!anotherTransaction.equalsIgnoreCase("yes")) {
                System.out.println("Thank you for using VEGA7 ATM!");
                break;
            }
        }

        scanner.close();
    }
}
