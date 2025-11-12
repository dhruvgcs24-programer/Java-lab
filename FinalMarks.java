import CIE.*;
import SEE.*;
import java.util.Scanner;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        External[] students = new External[n];
        Internals[] internals = new Internals[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // consume newline
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("USN: ");
            String usn = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Semester: ");
            int sem = sc.nextInt();

            // Create External (which extends Personal)
            students[i] = new External(usn, name, sem);

            // Internal marks
            internals[i] = new Internals();
            int[] internalMarks = new int[5];
            System.out.println("Enter 5 Internal Marks: ");
            for (int j = 0; j < 5; j++)
                internalMarks[j] = sc.nextInt();
            internals[i].setInternalMarks(internalMarks);

            // SEE marks
            int[] seeMarks = new int[5];
            System.out.println("Enter 5 SEE Marks: ");
            for (int j = 0; j < 5; j++)
                seeMarks[j] = sc.nextInt();
            students[i].setSeeMarks(seeMarks);
        }

        System.out.println("\n=== FINAL MARKS OF STUDENTS ===");
        for (int i = 0; i < n; i++) {
            students[i].displayPersonal();

            System.out.print("Final Marks in 5 Courses: ");
            for (int j = 0; j < 5; j++) {
                // Convert SEE marks (out of 100) to 50 scale by dividing by 2
                int finalMarks = internals[i].internalMarks[j] + (students[i].seeMarks[j] / 2);
                System.out.print(finalMarks + " ");
            }
            System.out.println("\n");
        }

        sc.close();
    }
}