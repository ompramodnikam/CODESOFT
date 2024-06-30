import java.util.*;

// Base class
class ATM 
{
    // Base class can contain common properties and methods for ATM operations
}

// Derived class
class BankAccount extends ATM 
{
    private double balance;

    public BankAccount(double initialBalance) 
    {
        if (initialBalance >= 0) 
        {
            this.balance = initialBalance;
        } 
        else 
        {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    public void withdraw(double amount) 
    {
        if (amount <= 0) 
        {
            System.out.println("Withdrawal amount must be greater than zero.");
        } 
        else if (amount > balance) 
        {
            System.out.println("Insufficient funds. Your current balance is $" + balance);
        } 
        else 
        {
            balance -= amount;
            System.out.println("Successfully withdrawn $" + amount);
        }
    }

    public void deposit(double amount) 
    {
        if (amount <= 0) 
        {
            System.out.println("Deposit amount must be greater than zero.");
        } 
        else 
        {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        }
    }

    public void checkBalance() 
    {
        System.out.println("Your current balance is $" + balance);
    }
}

public class Task3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        while (true) 
        {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
