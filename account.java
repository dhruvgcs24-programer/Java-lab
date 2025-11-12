
    import java.util.Scanner;

// Base class
class Account1 {
    protected String customerName;
    protected String accountNumber;
    protected String accountType;
    protected double balance;

    public Account1(String customerName, String accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

// Derived class for Savings Account
class SavAcct extends Account1 {
    private double interestRate = 0.05; // 5% interest

    public SavAcct(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
    }

    // Compute and deposit interest
    public void computeAndDepositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " deposited. New balance: " + balance);
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

// Derived class for Current Account
class CurAcct extends Account1 {
    private double minimumBalance = 1000.0;
    private double penalty = 100.0;

    public CurAcct(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            checkMinimumBalance();
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check minimum balance and impose penalty if necessary
    private void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= penalty;
            System.out.println("Balance below minimum. Penalty of " + penalty + " imposed.");
        }
    }
}

// Main class
public class account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name:");
        String name = sc.nextLine();

        System.out.println("Enter account number:");
        String accNo = sc.nextLine();

        System.out.println("Enter initial balance:");
        double bal = sc.nextDouble();

        System.out.println("Enter account type (Savings/Current):");
        sc.nextLine(); // consume newline
        String type = sc.nextLine();

        Account1 account;
        if (type.equalsIgnoreCase("Savings")) {
            account = new SavAcct(name, accNo, bal);
        } else {
            account = new CurAcct(name, accNo, bal);
        }

        int choice;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Deposit");
            System.out.println("2. Display Balance");
            System.out.println("3. Compute Interest (Savings Only)");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    account.displayBalance();
                    break;
                case 3:
                    if (account instanceof SavAcct) {
                        ((SavAcct) account).computeAndDepositInterest();
                    } else {
                        System.out.println("Interest not applicable for Current Account.");
                    }
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw: ");
                    double w = sc.nextDouble();
                    if (account instanceof SavAcct) {
                        ((SavAcct) account).withdraw(w);
                    } else if (account instanceof CurAcct) {
                        ((CurAcct) account).withdraw(w);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}


