import java.util.Scanner;

public class QuadraticEquation {

    // Function to input coefficients
    public static double[] inputCoefficients() {
        Scanner sc = new Scanner(System.in);
        double[] coeff = new double[3];

        System.out.print("Enter coefficient a: ");
        coeff[0] = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        coeff[1] = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        coeff[2] = sc.nextDouble();

        return coeff;
    }

    // Function to calculate discriminant
    public static double calculateDiscriminant(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    // Function to find and display roots
    public static void findRoots(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Not a quadratic equation (a cannot be 0).");
            return;
        }

        double D = calculateDiscriminant(a, b, c);
        System.out.println("Discriminant (D) = " + D);

        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Roots are complex and imaginary:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static void main(String[] args) {
        double[] coeff = inputCoefficients();
        findRoots(coeff[0], coeff[1], coeff[2]);
    }
}
