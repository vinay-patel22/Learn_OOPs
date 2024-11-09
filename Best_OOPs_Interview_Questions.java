/*
    1. What is Object Oriented Programming (OOPs)?

    - a programming paradigm.
    - where the complete software operates as a bunch of objects talking to each other.
    - An object is a collection of data and the methods which operate on that data.
    
    2. Why OOPs?

    - Understanding of the software is increased (as the distance between the language spoken by developers and that spoken by users)

    - Modularity and Reusability
    - Code Organization and Readability
    - Abstraction
    - Maintainability and Scalability

    3. What is a Class?

    - A class is a building block of Object Oriented Programs. 
    - It is like a blueprint or template of objects having common properties and methods.
    - It is a user-defined data type that contains the data members and member functions that operate on the data members. 

    4. What is an Object?

    - An object is an instance of a class. 
    - In simple terms, they are the actual world entities that have a state and behavior.

    - Data members and methods of a class cannot be used directly. We need to create an object (or instance) of the class to use them. 

    5. What are the main features of OOPs?
    
    - Inheritance
    - Polymorphism
    - Encapsulation
    - Data Abstraction


 */

//  class definition
class StudentUrban {
    String studentName;
}

public class Best_OOPs_Interview_Questions {

    public static void main(String[] args) {

        // creating an object
        StudentUrban student1 = new StudentUrban();

        // assigning member some value
        student1.studentName = "Vinay Patel";

        System.out.println("Student1.studentName = " + student1.studentName);
    }
}