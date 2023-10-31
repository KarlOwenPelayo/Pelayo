import java.util.Scanner;

public class BankAccount {
    private int accountNumber;       // This Stores the account number
    private String accountName;      // This stores the account  name
    private double balance;          // This stores the account balance
    private StringBuilder transactionSummary; //This stores a summary of transactions

    // Constructor to initialize the account with an account number and name
    public BankAccount(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 0.0;
        this.transactionSummary = new StringBuilder("Transaction Summary:\n");
    }

    // Method to deposit funds into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionSummary.append("Deposited: $").append(amount).append("\n");
        } else {
            transactionSummary.append("Invalid deposit amount. Amount must be greater than 0.\n");
        }
    }

    // Method to withdraw funds from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionSummary.append("Withdrawn: $").append(amount).append("\n");
        } else {
            transactionSummary.append("Invalid withdrawal amount or insufficient balance.\n");
        }
    }

    // Method to display the account balance and information
    public void displayBalance() {
        transactionSummary.append("Account Number: ").append(accountNumber).append("\n");
        transactionSummary.append("Account Name ").append(accountName).append("\n");
        transactionSummary.append("Balance: $").append(balance).append("\n");
    }

    // Method to retrieve the transaction summary
    public String getTransactionSummary() {
        return transactionSummary.toString();
    }
}
