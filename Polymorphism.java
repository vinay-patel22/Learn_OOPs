/*
    Polymorphism:
    -> The word "poly" means many and "morphs" means forms, so polymorphism means many forms.
    -> There are two types of polymorphism in Java:
        a) Compile-time polymorphism (Method Overloading)
        b) Runtime polymorphism (Method Overriding with Dynamic Method Dispatch)
    -> Polymorphism allows objects of different classes to be treated as objects of a common superclass, 
       with each subclass providing a specific implementation.
    -> Rule: Runtime polymorphism cannot be achieved by data members (fields).

    Example of Upcasting:
    -> Upcasting occurs when a parent class reference variable refers to a child class object.
    -> This allows polymorphism to occur by invoking overridden methods in the subclass.
*/

class Bike2 {
    void run() {
        System.out.println("Bike is running!");
    }
}

class Splendor extends Bike2 {
    // Overriding the run() method
    void run() {
        System.out.println("Splendor is running safely");
    }
}

class NewBank {
    // Base method providing default rate of interest
    float getRateOfInterest() {
        return 0;
    }
}

class NewSBI extends NewBank {
    // Overriding getRateOfInterest for SBI
    float getRateOfInterest() {
        return 8.4f;
    }
}

class NewICICI extends NewBank {
    // Overriding getRateOfInterest for ICICI
    float getRateOfInterest() {
        return 7.3f;
    }
}

class NewAXIS extends NewBank {
    // Overriding getRateOfInterest for AXIS
    float getRateOfInterest() {
        return 9.7f;
    }
}

// Example of Shape class and its subclasses to demonstrate method overriding
class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}

class Rectangle extends Shape {
    // Overriding draw() method for Rectangle
    void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape {
    // Overriding draw() method for Circle
    void draw() {
        System.out.println("drawing circle...");
    }
}

class Triangle extends Shape {
    // Overriding draw() method for Triangle
    void draw() {
        System.out.println("drawing triangle...");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Demonstrating Upcasting and Runtime Polymorphism
        Bike2 b = new Splendor(); // Upcasting: parent class reference, child class object
        b.run(); // Calls the overridden method in Splendor class

        // Demonstrating polymorphism in banking system
        NewBank bank = new NewSBI(); // Upcasting to parent class reference
        System.out.println("SBI Rate of Interest: " + bank.getRateOfInterest());

        bank = new NewICICI(); // Reference pointing to ICICI object
        System.out.println("ICICI Rate of Interest: " + bank.getRateOfInterest());

        bank = new NewAXIS(); // Reference pointing to AXIS object
        System.out.println("AXIS Rate of Interest: " + bank.getRateOfInterest());

        // Demonstrating polymorphism with shapes
        Shape s;
        s = new Rectangle(); // Upcasting: reference of Shape, object of Rectangle
        s.draw(); // Calls Rectangle's draw() method

        s = new Circle(); // Upcasting: reference of Shape, object of Circle
        s.draw(); // Calls Circle's draw() method

        s = new Triangle(); // Upcasting: reference of Shape, object of Triangle
        s.draw(); // Calls Triangle's draw() method

        // Example of Method Overloading (Compile-time Polymorphism)
        System.out.println("Result of addition (2 numbers): " + add(5, 10));
        System.out.println("Result of addition (3 numbers): " + add(5, 10, 15));
    }

    // Method Overloading Example: Compile-time Polymorphism
    // Same method name, different parameters
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
