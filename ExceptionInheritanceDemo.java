// Custom exception for wrong age
class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

// Base class Father
class Father {
    int fatherAge;

    // Constructor
    Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative.");
        }
        this.fatherAge = age;
        System.out.println("Father's age: " + fatherAge);
    }
}

// Derived class Son
class Son extends Father {
    int sonAge;

    // Constructor
    Son(int fAge, int sAge) throws WrongAgeException {
        super(fAge);  // Call Father constructor

        if (sAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative.");
        }
        if (sAge >= fAge) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to father's age.");
        }

        this.sonAge = sAge;
        System.out.println("Son's age: " + sonAge);
    }
}

public class ExceptionInheritanceDemo {
    public static void main(String[] args) {
        try {
            // Valid case
            Son s1 = new Son(40, 15);
            System.out.println("Object created successfully.\n");

            // Invalid case (son >= father age)
            Son s2 = new Son(30, 35);
        }
        catch (WrongAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
