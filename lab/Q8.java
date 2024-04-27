package lab;

// Write a Java programming to create a banking system with three classes - Bank 
// Account  ,SavingsAccount, and CurrentAccount. The bank should have a list of 
// accounts and methods for adding them. Accounts should be an interface with 
// methods to deposit, withdraw, calculate interest, and view balances. 
// SavingsAccount and CurrentAccount should implement the Account interface and 
// have their own unique methods.

// Interface for bank accounts
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    double calculateInterest();
}

// BankAccount class implementing Account interface
class BankAccount implements Account {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double calculateInterest() {
        return 0; // Default implementation for base account
    }
}

// SavingsAccount class extending BankAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance); 
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * (interestRate / 100);
    }

    public void addInterest() {
        double interest = calculateInterest();
        deposit(interest);
    }
}

// CurrentAccount class extending BankAccount
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Exceeded overdraft limit");
        }
    }
}

// Bank class to manage accounts
class Bank {
    private Account[] accounts;
    private int numAccounts;

    public Bank(int maxSize) {
        accounts = new Account[maxSize];
        numAccounts = 0;
    }

    public void addAccount(Account account) {
        if (numAccounts < accounts.length) {
            accounts[numAccounts] = account;
            numAccounts++;
        } else {
            System.out.println("Bank is full, cannot add more accounts");
        }
    }

    public void displayAccounts() {
        for (int i = 0; i < numAccounts; i++) {
            System.out.println("Account " + (i + 1) + " Balance: " + accounts[i].getBalance());
        }
    }
}

// Main class to test the banking system
    

public class Q8 {
    public static void main(String[] args) {
        Bank bank = new Bank(10); // Maximum of 10 accounts
        
        // Creating Savings Account
        SavingsAccount acc1 = new SavingsAccount(5000, 5);
        bank.addAccount(acc1);

        // Creating Current Account
        CurrentAccount acc2 = new CurrentAccount(10000, 2000);
        bank.addAccount(acc2);

        // Displaying account balances
        bank.displayAccounts();

        // Depositing and Withdrawing from Savings Account
        acc1.deposit(1000);
        acc1.addInterest();
        acc1.withdraw(200);
        System.out.println("Savings Account Balance after transactions: " + acc1.getBalance());

        // Withdrawing from Current Account
        acc2.withdraw(3000);
        System.out.println("Current Account Balance after withdrawal: " + acc2.getBalance());
    }
}

