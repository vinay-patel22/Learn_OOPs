/*
    The `final` keyword in Java is used to restrict modifications.
    It can be applied in three contexts:
    
    1. **Final Variable**: Prevents modification after initial assignment.
    2. **Final Method**: Prevents overriding in subclasses.
    3. **Final Class**: Prevents inheritance (cannot be extended).

    Common Questions:

    Q) Is a final method inherited?
       -> Yes, a final method is inherited but cannot be overridden.

    Q) Can we initialize a blank final variable?
       -> Yes, but only in the constructor.

    Q) What about a static blank final variable?
       -> It can be initialized in a static block.

    Q) Can a constructor be final?
       -> No, because constructors are not inherited.
 */

class Transport {
    // Final variable: cannot be changed once initialized
    final int cost = 78000;

    // This method would attempt to change a final variable, causing a compile-time
    // error
    // void discount() {
    // price = 55000; // Error: Cannot reassign a final variable
    // }

    // Final method: cannot be overridden in subclasses
    final void operate() {
        System.out.println("Transport is operating...");
    }
}

// Subclass attempting to override a final method, which is not allowed
class Car extends Transport {
    // Error: Cannot override the final method from Bike
    // void run() {
    // System.out.println("High speed! 100 km/h!!!");
    // }
}

// Final class example: prevents further inheritance
final class FixedTransport {
    void displayInfo() {
        System.out.println("FixedTransport: This is a final class.");
    }
}

// Attempting to extend a final class (not allowed)
// class ExtendableTransport extends FixedTransport { // Error: Cannot inherit
// from final class
// }

class Movable {
    // Final method in superclass
    final void operate() {
        System.out.println("Movable is operating!");
    }
}

// Main class to demonstrate final keyword usage and restrictions
public class Final extends Movable {
    public static void main(String[] args) {

        // Demonstrate final variable
        // Bike b1 = new Bike();
        // b1.discount(); // Uncommenting causes Compile Time Error: Cannot assign a
        // value to final variable 'price'

        // Demonstrate final class restriction
        FixedTransport fixedTransport = new FixedTransport();
        fixedTransport.displayInfo();

        // Demonstrate final method restriction
        // Honda h1 = new Honda();
        // h1.run(); // Uncommenting causes Compile Time Error: Cannot override the
        // final method from Bike

        // Demonstrate final class restriction
        // Bike1 bike1 = new Bike1();
        // bike1.display();
        // Honda1 honda1 = new Honda1(); // Uncommenting causes Compile Time Error:
        // Cannot inherit from final class

        // Demonstrate final method inheritance without overriding
        new Final().operate(); // Calls run() method from BikeInherit
    }
}
