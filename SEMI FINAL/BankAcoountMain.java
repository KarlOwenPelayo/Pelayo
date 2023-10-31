import java.util.Scanner;

public class BankAcoountMain{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // This create a Scanner object to get user input
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Account Name: ");
        String accountName = scanner.nextLine();

        BankAccount account = new BankAccount(accountNumber, accountName);
        // This create a loop for the bank account menu
        while (true) {
            // Display the bank account menu options
            System.out.println("\nBank Account Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
 
            if (option == 1) {                      // This prompt the user to enter the deposit amount 
                System.out.print("Enter the deposit amount: $");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);     // Perform a deposit and record the transaction
            } else if (option == 2) {               // Prompt the user to enter the withdrawal amount
                System.out.print("Enter the withdrawal amount: $");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);   // Perform a withdrawal and record the transaction
            } else if (option == 3) {               // Display the account balance and exit the loop                 
                account.displayBalance();
              break;
            } else {                                // Display an error message for an invalid option
                System.out.println("Invalid option. Please select a valid option.");
            }
        }

        // Display the transaction summary
        System.out.println(account.getTransactionSummary());
    }
}


 /*How to get the Enformation Example:
   Bank Account Number: 343434
   Bank Account Name: Karl Owen
   
   Bank Account Menu:
 1. Deposit
 2. Withdraw
 3. Display Balance
 Select an option: 1
 Enter the deposit amount: $50000
 
 Bank Account Menu:
 1. Deposit
 2. Withdraw
 3. Display Balance
 Select an option: 2
 Enter the withdrawal amount: $334
 
 Bank Account Menu:
 1. Deposit
 2. Withdraw
 3. Display Balance
 Select an option: 3
 Transaction Summary:
 Deposited: $50000.0
 Withdrawn: $334.0
 Account Number: 343434
 Account Name : Karl Owen
 Balance: $49666.0
  */
 
   