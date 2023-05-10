
import java.util.Scanner;

public class lab4 {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private double[] transactions;
    private int transactionIndex;

    public lab4(int accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.transactions = new double[100];
        this.transactionIndex = 0;
    }

    public void deposit(double amount) {
        accountBalance += amount;
        transactions[transactionIndex] = amount;
        transactionIndex++;
        System.out.println("Deposit successful. New balance is: " + accountBalance);
    }

    public void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Withdrawal failed. Insufficient balance.");
            return;
        }
        accountBalance -= amount;
        transactions[transactionIndex] = -amount;
        transactionIndex++;
        System.out.println("Withdrawal successful. New balance is: " + accountBalance);
    }

    public void printTransactions() {
        System.out.println("Transaction history:");
        for (int i = 0; i < transactionIndex; i++) {
            if (transactions[i] > 0) {
                System.out.println("Deposit: " + transactions[i]);
            } else {
                System.out.println("Withdrawal: " + -transactions[i]);
            }
        }
    }

    public void printSummary() {
        System.out.println("Account summary:");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account balance: " + accountBalance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our bank. Please enter your account details to continue:");
        System.out.print("Account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Account holder name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Account balance: ");
        double accountBalance = scanner.nextDouble();
        lab4 bankAccount = new lab4(accountNumber, accountHolderName, accountBalance);
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Print transactions");
            System.out.println("4. Print account summary");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawalAmount);
                    break;
                case 3:
                    bankAccount.printTransactions();
                    break;
                case 4:
                    bankAccount.printSummary();
                    break;
                case 0:
                    System.out.println("Thank you for using our bank. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
