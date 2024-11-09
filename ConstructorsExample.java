/*
1) Constructor: A constructor is a special method invoked automatically when an object is created. It is used to initialize the object's data members.

    - Constructors must have the same name as the class.
    - Constructors don’t have a return type (Not even `void`).
    - Constructors are called only once, at the time of object creation.

2) There are three types of constructors in Java:

1. Non-Parameterized Constructor (Default Constructor):
   - A constructor with no arguments is known as a non-parameterized (or default) constructor.
   - It is automatically provided by the compiler if no constructor is explicitly defined in the class.
   - It assigns default values (like 0 for numeric types, `null` for objects) to the instance variables.

2. Parameterized Constructor:
   - A constructor that accepts specific parameters to initialize the object with values provided at the time of object creation.
   - Useful to provide different values to distinct objects.

3. Copy Constructor:
   - A constructor that initializes a new object as a copy of an existing object.
   - Unlike C++, Java does not provide a default copy constructor. The programmer must define it explicitly.
*/

class Bike1 {
    // Default constructor: Automatically created by the compiler if no constructor
    // is defined.
    Bike1() {
        System.out.println("Bike is created");
    }
}

class StudentDetails {
    String name;
    int id;

    // Parameterized constructor: Initializes the object with the provided values.
    StudentDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display student data
    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
}

class StudentCopy {
    String name;
    int id;

    // Parameterized constructor to initialize object
    StudentCopy(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy constructor: Initializes the object as a copy of another object
    StudentCopy(StudentCopy s2) {
        this.name = s2.name;
        this.id = s2.id;
    }

    // Method to display student data
    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
}

public class ConstructorsExample {
    public static void main(String[] args) {
        // Creating an object using the default constructor (bike1).
        // Uncomment to see the default constructor in action.
        // Bike1 b1 = new Bike1(); // Output: Bike is created

        // Creating objects using the parameterized constructor (StudentDetails).
        StudentDetails s1 = new StudentDetails("Vinay", 42);
        StudentDetails s2 = new StudentDetails("Patel", 41);
        s1.displayData();
        s2.displayData();

        // Creating objects using the copy constructor (StudentCopy).
        StudentCopy s3 = new StudentCopy("Vinay", 42);
        StudentCopy s4 = new StudentCopy(s3); // Using the copy constructor to copy s3 into s4
        s3.displayData();
        s4.displayData();
    }
}
