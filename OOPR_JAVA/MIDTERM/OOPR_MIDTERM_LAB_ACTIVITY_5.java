import java.util.Scanner;

// ABSTRACTION
abstract class Account {
    private String accountNumber;
    private double balance;

    // CONSTRUCTOR
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // GETTERS
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public abstract double calculateWithdrawalFee();
    public abstract String getAccountType();

    // DEPOSIT METHOD
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid input: Amount must be positive.");
            return false;
        }
        this.balance += amount;
        return true;
    }

    // WITHDRAW METHOD
    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid input: Amount must be positive.");
            return false;
        }

        double fee = calculateWithdrawalFee();
        if (this.balance < (amount + fee)) {
            System.out.println("Error: Insufficient funds! Transaction rejected.");
            return false;
        }

        this.balance -= (amount + fee);
        return true;
    }
}

// INHERITANCE
class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateWithdrawalFee() {
        return 0.0; // NO FEE
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}

class CheckingAccount extends Account {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateWithdrawalFee() {
        return 10.0; // CHECKING FEE 10 PESOS
    }

    @Override
    public String getAccountType() {
        return "Checking";
    }
}

public class OOPR_MIDTERM_LAB_ACTIVITY_5 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("BANKO NI ZAP");
        
        // CREATE ACCOUNTS
        double openingBalance = readNonNegativeBalance();
        SavingsAccount savingsAccount = new SavingsAccount("SAV-101", openingBalance);
        CheckingAccount checkingAccount = new CheckingAccount("CHK-202", openingBalance);

        // POLYMORPHISM
        Account selectedAccount = savingsAccount; 

        int choice = 0;
        while (choice != 5) {
            printAccountSummary(selectedAccount);
            showMenu();
            
            System.out.print("Choice: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid menu choice. Try again.\n");
                scanner.next(); // Clear the bad entry
                continue;
            }
            choice = scanner.nextInt();
            // WITHDRAW
            if (choice == 1) {
                double amount = readPositiveAmount("Amount to withdraw: ");
                if (amount > 0) {
                    double fee = selectedAccount.calculateWithdrawalFee();
                    if (selectedAccount.withdraw(amount)) {
                        System.out.printf("Withdrawal fee: %.2f | New %s balance: %.2f\n", 
                                fee, selectedAccount.getAccountType(), selectedAccount.getBalance());
                    }
                }
            } 
            // DEPOSIT
            else if (choice == 2) {
                double amount = readPositiveAmount("Amount to deposit: ");
                if (amount > 0) {
                    if (selectedAccount.deposit(amount)) {
                        System.out.printf("New %s balance: %.2f\n", 
                                selectedAccount.getAccountType(), selectedAccount.getBalance());
                    }
                }
            } 
            // SHOW BALANCE
            else if (choice == 3) {
                System.out.printf("Current %s balance: %.2f\n", 
                        selectedAccount.getAccountType(), selectedAccount.getBalance());
            } 

            // SWITCH ACCOUNT TYPE
            else if (choice == 4) {
                if (selectedAccount == savingsAccount) {
                    selectedAccount = checkingAccount;
                } else {
                    selectedAccount = savingsAccount;
                }
            }

            // EXIT
            else if (choice == 5) {
                System.out.println("Thank you for using the system!");
            } 
            else {
                System.out.println("Invalid menu choice. Try again.");
            }
            System.out.println();
        }
    }

    // MENU DISPLAY
    public static void showMenu() {
        System.out.println("1 Withdraw\n2 Deposit\n3 Show balance\n4 Switch account\n5 Exit");
    }

    // ACCOUNT SUMMARY DISPLAY
    public static void printAccountSummary(Account account) {
        System.out.printf("Current account: %s | Balance: %.2f\n", 
                account.getAccountType(), account.getBalance());
    }

    // INPUT VALIDATION METHODS
    public static double readNonNegativeBalance() {
        while (true) {
            System.out.print("Opening balance: ");
            if (scanner.hasNextDouble()) {
                double val = scanner.nextDouble();
                if (val >= 0) return val;
            } else {
                scanner.next(); // CLEAR INVALID STRING INPUT
            }
            System.out.println("Invalid input. Opening balance must be 0 or higher.");
        }
    }

    // READ POSITIVE AMOUNT METHOD
    public static double readPositiveAmount(String prompt) {
        System.out.print(prompt);
        if (scanner.hasNextDouble()) {
            double val = scanner.nextDouble();
            if (val > 0) return val;
        } else {
            scanner.next(); // CLEAR INVALID STRING INPUT
        }
        System.out.println("Invalid amount. Transaction cancelled.");
        return -1; // RETURN -1 TO INDICATE INVALID INPUT
    }
}
