import java.util.Scanner;

public class IndexExample {
    public static void main(String[] args) {

        String[] items = {"Apple", "Banana", "Orange", "Grapes", "Mango"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Items in the list:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + " → " + items[i]);
        }

        System.out.print("\nEnter an index to access: ");

        try {
            int index = sc.nextInt();
            System.out.println("Item at index " + index + " is: " + items[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Error: Index out of range!");
        } 
        catch (Exception e) {
            System.out.println("❌ Error: Please enter a valid number.");
        }

        sc.close();
    }
}
