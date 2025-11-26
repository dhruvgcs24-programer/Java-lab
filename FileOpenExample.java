import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOpenExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = sc.nextLine();

        try {
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);

            System.out.println("File opened successfully!");
            System.out.println("---- File Content ----");

            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }

            fileReader.close();

        } 
        catch (FileNotFoundException e) {
            System.out.println("❌ Error: File not found!");
        }

        sc.close();
    }
}
