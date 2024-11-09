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

class Vehicle {
    void operate() {
        System.out.println("Vehicle is operating!");
    }
}

class Scooter extends Vehicle {
    void operate() {
        System.out.println("Scooter is operating smoothly");
    }
}

class Bank {
    float getInterestRate() {
        return 0;
    }
}

class HDFCBank extends Bank {
    float getInterestRate() {
        return 8.4f;
    }
}

class KotakBank extends Bank {
    float getInterestRate() {
        return 7.3f;
    }
}

class YesBank extends Bank {
    float getInterestRate() {
        return 9.7f;
    }
}

// Example of Shape class and its subclasses to demonstrate method overriding
class Graphic {
    void render() {
        System.out.println("Rendering...");
    }
}

class Square extends Graphic {
    void render() {
        System.out.println("Rendering square...");
    }
}

class Oval extends Graphic {
    void render() {
        System.out.println("Rendering oval...");
    }
}

class Hexagon extends Graphic {
    void render() {
        System.out.println("Rendering hexagon...");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Demonstrating Upcasting and Runtime Polymorphism
        Vehicle v = new Scooter(); // Upcasting
        v.operate(); // Calls the overridden method in Splendor class

        // Demonstrating polymorphism in banking system
        Bank bankRef = new HDFCBank(); // Upcasting to parent class reference
        System.out.println("HDFC Bank Interest Rate: " + bankRef.getInterestRate());

        bankRef = new KotakBank(); // Reference pointing to KotakBank object
        System.out.println("Kotak Bank Interest Rate: " + bankRef.getInterestRate());

        bankRef = new YesBank(); // Reference pointing to YesBank object
        System.out.println("Yes Bank Interest Rate: " + bankRef.getInterestRate());

        // Demonstrating polymorphism with shapes
        Graphic g;
        g = new Square(); // Upcasting: reference of Graphic, object of Square
        g.render(); // Calls Square's render() method

        g = new Oval(); // Upcasting: reference of Graphic, object of Oval
        g.render(); // Calls Oval's render() method

        g = new Hexagon(); // Upcasting: reference of Graphic, object of Hexagon
        g.render(); // Calls Hexagon's render() method

        System.out.println("Sum of two numbers: " + calculateSum(5, 10));
        System.out.println("Sum of three numbers: " + calculateSum(5, 10, 15));

    }

    // Method Overloading Example: Compile-time Polymorphism
    // Same method name, different parameters
    public static int calculateSum(int x, int y) {
        return x + y;
    }

    public static int calculateSum(int x, int y, int z) {
        return x + y + z;
    }
}
