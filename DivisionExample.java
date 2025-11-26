import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter denominator: ");
            double num2 = sc.nextDouble();

            if (num2 == 0) {
                System.out.println("❌ Error: Cannot divide by zero!");
            } else {
                double result = num1 / num2;
                System.out.println("Result = " + result);
            }

        } catch (Exception e) {
            System.out.println("❌ Invalid input! Please enter numeric values only.");
        }

        sc.close();
    }
}
