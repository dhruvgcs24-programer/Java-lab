package CIE;

public class Internals {
    public int[] internalMarks = new int[5];  // Marks for 5 courses

    public void setInternalMarks(int[] marks) {
        for (int i = 0; i < 5; i++) {
            internalMarks[i] = marks[i];
        }
    }

    public void displayInternals() {
        System.out.print("Internal Marks: ");
        for (int mark : internalMarks)
            System.out.print(mark + " ");
        System.out.println();
    }
}
