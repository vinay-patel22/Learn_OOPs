/* 
1) Class in Java:
   - A class is a blueprint from which objects are created. It defines properties (fields) and behaviors (methods) for objects.
   - A class can have:
     - Fields (variables)
     - Methods (functions)
     - Constructors (for initializing objects)
     - Blocks (static and instance blocks)
     - Nested classes and interfaces

2) Object in Java:
   - An object is an instance of a class. 
   - It has three main characteristics:
     - **State**: Represented by fields/variables.
     - **Behavior**: Represented by methods/functions.
     - **Identity**: The reference that uniquely identifies the object.

3) The 'this' Keyword:
   - Refers to the current object or instance of the class.
   - It is used:
     1) To access instance variables when they are shadowed by constructor or method parameters.
     2) To pass the current object as a parameter to another method or constructor.
*/

class Student {
    String name;
    int age;

    // Constructor to initialize Student object
    // 'this' is used to refer to the current object's fields to avoid naming
    // conflicts
    public Student(String name, int age) {
        this.name = name; // 'this.name' refers to the instance variable of the class
        this.age = age; // 'this.age' refers to the instance variable of the class
    }

    // Method to display student's information
    public void getStudentInfo() {
        // 'this' is used to explicitly refer to the current object’s fields
        System.out.println("Student name : " + this.name);
        System.out.println("Student age : " + this.age);
    }

    // Method demonstrating the use of 'this' to pass the current object as a
    // parameter
    public void printStudent(Student student) {
        System.out.println("Passing the current student object to another method:");
        student.getStudentInfo(); // Calling method on the passed student object
    }

    // Method demonstrating 'this' used for constructor chaining (calling one
    // constructor from another)
    public Student(String name) {
        this(name, 18); // Calls the main constructor with default age (18)
    }
}

public class BasicConcept {
    public static void main(String[] args) {
        // Creating a new Student object
        Student s1 = new Student("Vinay", 21); // Using constructor with both name and age parameters
        s1.getStudentInfo(); // Displaying student info

        // Demonstrating the use of 'this' to pass the current object to another method
        s1.printStudent(s1); // Passing current object (s1) to the printStudent method

        // Creating a new Student object with a single argument constructor
        Student s2 = new Student("Raj");
        s2.getStudentInfo(); // This will display the name and default age (18)
    }
}
