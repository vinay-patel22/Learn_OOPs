/*
-> The super keyword in Java is a reference variable used to refer to the immediate parent class object.

-> When you create an instance of a subclass, an instance of the parent class is implicitly created.
   This instance of the parent class is referred to by the super reference variable.

** Usage of the Java super Keyword: **

-> Refer to the immediate parent class instance variable.
-> Invoke the immediate parent class method.
-> Use super() to invoke the immediate parent class constructor.

Note: 
- If no constructor is explicitly called in the subclass constructor, the compiler automatically adds a call to the parent class's default constructor using `super()`.
*/

class AnimalOld {
    String color = "White"; // Parent class instance variable

    // Parent class method
    void eat() {
        System.out.println("Animal class is eating...");
    }

    // Parent class constructor
    AnimalOld() {
        System.out.println("Animal is created...");
    }
}

class DogOld extends AnimalOld {
    String color = "Black"; // Subclass instance variable

    // Subclass method overriding the parent method
    void eat() {
        System.out.println("Dog class is eating...");
    }

    // New method specific to Dog class
    void bark() {
        System.out.println("Dog is barking...");
    }

    // Subclass method calling the parent class method
    void work() {
        super.eat(); // Calls the parent class's eat method
        bark(); // Calls the current class's bark method
    }

    // Method demonstrating the use of super to refer to the parent class's variable
    void printColor() {
        System.out.println(color); // Prints the color of the Dog class
        System.out.println(super.color); // Prints the color of the Animal class
    }

    // Subclass constructor calling the parent class constructor using super()
    DogOld() {
        super(); // Calls the parent class constructor (implicitly added by compiler if not
                 // present)
        System.out.println("Dog is created...");
    }
}

// Real-Life Example: Employee class extending Person class
class Person {
    int id;
    String name;

    // Constructor of Person class
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person {
    float salary;

    // Constructor of Emp class calling the parent class constructor using super()
    Emp(int id, String name, float salary) {
        super(id, name); // Reusing the constructor of the Person class
        this.salary = salary;
    }

    // Method to print employee details
    void printDetails() {
        System.out.println("ID :- " + id);
        System.out.println("Name :- " + name);
        System.out.println("Salary :- " + salary);
    }
}

public class Super {
    public static void main(String[] args) {
        // Dog class example
        DogOld d = new DogOld(); // Calls the Dog constructor which in turn calls the Animal constructor
        d.printColor(); // Demonstrates super to access the parent class variable
        d.work(); // Calls the work method which invokes the super class's eat method

        // Emp class example
        Emp e1 = new Emp(1, "Vinay", 55000f); // Calls the Emp constructor, which calls Person's constructor
        e1.printDetails(); // Prints employee details
    }
}
