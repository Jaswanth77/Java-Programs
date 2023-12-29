// Interface for common account functionality
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

// Abstract class representing a generic bank account
abstract class BankAccount implements Account {
    public String accountNumber;
    public double balance;

    // Constructor for BankAccount
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Implementation of deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Implementation of withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    // Implementation of checkBalance method
    @Override
    public double checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        return balance;
    }
}

// SavingsAccount class extending BankAccount
class SavingsAccount extends BankAccount {
    private final double interestRate;

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    // Custom method for applying interest to savings account
    public void applyInterest() {
        double interest = checkBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest applied: $" + interest);
    }
}

// CheckingAccount class extending BankAccount
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor for CheckingAccount
    public CheckingAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    // Custom method for checking if withdrawal is within overdraft limit
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or overdraft limit exceeded");
        }
    }
}

// LoanAccount class extending BankAccount
class LoanAccount extends BankAccount {
    private final double interestRate;

    // Constructor for LoanAccount
    public LoanAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    // Custom method for applying interest to loan account
    public void applyInterest() {
        double interest = checkBalance() * interestRate / 100;
        withdraw(interest);
        System.out.println("Interest applied: $" + interest);
    }
}

public class Day4_qn2 {
    public static void main(String[] args) {
        // Example usage
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 2.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 500.0);
        LoanAccount loanAccount = new LoanAccount("LA789", 7.0);

        savingsAccount.deposit(1000.0);
        savingsAccount.applyInterest();
        savingsAccount.checkBalance();

        checkingAccount.deposit(800.0);
        checkingAccount.withdraw(200.0);
        checkingAccount.checkBalance();

        loanAccount.deposit(5000.0);
        loanAccount.applyInterest();
        loanAccount.checkBalance();
    }
}
