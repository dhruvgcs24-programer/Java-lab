import java.util.Scanner;

public class BankWithdrawalThrows {

    // Method that performs withdrawal and THROWS exceptions
    public static void withdraw(double amount, double balance) throws Exception {

        if (amount <= 0) {
            throw new Exception("❌ Invalid amount. Enter a positive number.");
        }

        if (amount > balance) {
            throw new Exception("❌ Insufficient balance! Your current balance is: " + balance);
        }

        // If valid withdrawal
        System.out.println("✅ Withdrawal successful!");
        System.out.println("💰 Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0;

        try {
            System.out.print("Enter withdrawal amount: ");

            // Handle non-numeric input
            double amount = Double.parseDouble(sc.next());

            // Call method that uses throws
            withdraw(amount, balance);

        } catch (NumberFormatException e) {
            System.out.println("❌ Error: Please enter valid numeric input.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
