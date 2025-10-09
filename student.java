import java.util.Scanner;

public class student {
    String name;
    int USN;
    int[] credits = new int[5];
    float[] marks = new float[5];
    float gradepoint, resultsum = 0, creditsum = 0, SGPA;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the USN of the student: ");
        USN = sc.nextInt();
        System.out.println("Enter the name of the student: ");
        name = sc.next();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the marks of subject " + (i + 1) + " : ");
            marks[i] = sc.nextFloat();
            System.out.println("Enter the credits of subject " + (i + 1) + " : ");
            credits[i] = sc.nextInt();
        }

    }

    void calculate() {
        for (int i = 0; i < 5; i++) {
            if (marks[i] <= 100 && marks[i] >= 90) {
                gradepoint = 10;
                resultsum += gradepoint * credits[i];
            } else if (marks[i] < 90 && marks[i] >= 80) {
                gradepoint = 9;
                resultsum += gradepoint * credits[i];
            } else if (marks[i] < 80 && marks[i] >= 70) {
                gradepoint = 8;
                resultsum += gradepoint * credits[i];
            } else if (marks[i] < 70 && marks[i] >= 60) {
                gradepoint = 7;
                resultsum += gradepoint * credits[i];
            } else {
                // System.out.println("Fail...");
                gradepoint = 0;
                resultsum += gradepoint * credits[i];
            }
            creditsum += credits[i];
        }
        SGPA = resultsum / creditsum;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("USN:" + USN);
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + " : " + marks[i]);
        }
        System.out.println("SGPA: " + SGPA);
    }
    public static void main(String[] args) {
        student s1 = new student();
        s1.input();
        s1.calculate();
        s1.display();
    }
}
