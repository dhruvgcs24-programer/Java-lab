import java.util.Scanner;

public class Main {
    double a, b;
    double result; 

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = sc.nextDouble();
        System.out.println("Enter the value of b: ");
        b = sc.nextDouble();
    }

    double calculate(String symbol) {
        if (symbol.equals("+")) {
            return a + b;
        } else if (symbol.equals("-")) {
            return a - b;
        } else if (symbol.equals("/")) {
            if (b == 0) {
                System.out.println("Not divisible!!");
                return 0.0;
            } else {
                return a / b;
            }
        } else if (symbol.equals("*")) {
            return a * b;
        } else {
            System.out.println("Enter valid operator!!");
            return 0.0;
        }
    }

    void display() {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        Main a1 = new Main();
        a1.input();
        System.out.println("Enter the operator: ");
        String symbol = c.nextLine();
        a1.result = a1.calculate(symbol);  
        a1.display();
        c.close();
    }
}
