/* 
-> A class declared with the abstract keyword is known as an abstract class in Java.
-> It can have both abstract and non-abstract methods.

-> Abstraction is a process of hiding implementation details and showing only functionality to the user.

Two ways to achieve abstraction in Java:
1) Abstract class (0 to 100% abstraction)
2) Interface (100% abstraction)
*/

/*
    Abstract class in Java:
    -> A class declared as abstract is an abstract class.
    -> It needs to be extended and its abstract methods implemented by a subclass.
    -> It cannot be instantiated directly.

    Key Points:
    -> An abstract class must use the 'abstract' keyword.
    -> It can contain both abstract and non-abstract methods.
    -> It cannot be instantiated.
    -> It can contain constructors and static methods.
    -> It can contain final methods, which prevent subclasses from modifying them.
*/

// Abstract class example: representing a generic Bike
abstract class BikeAbs {
    // Abstract method, requires implementation in subclass
    abstract void run();
}

// Concrete subclass implementing the abstract method
class HondaAbs extends BikeAbs {
    // Implementation of the run method
    void run() {
        System.out.println("Honda Bike is running safely.");
    }
}

/*
 * Interface Example:
 * -> Interfaces in Java can be implemented by any class, providing method
 * contracts without implementation.
 * -> Abstract classes can implement interfaces to provide partial
 * implementation, which helps reduce redundancy for subclasses.
 */

// Defining an interface with abstract methods
interface Vehicle {
    void start();

    void accelerate();

    void brake();

    void stop();
}

// Abstract class providing partial implementation of Vehicle
abstract class PartialVehicle implements Vehicle {
    // Implementing one of the interface methods with shared functionality
    public void brake() {
        System.out.println("Vehicle is braking.");
    }
}

// Concrete class providing full implementation of Vehicle
class Car extends PartialVehicle {
    public void start() {
        System.out.println("Car is starting.");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    public void stop() {
        System.out.println("Car has stopped.");
    }
}

// Main class for testing abstract classes and interfaces
public class Abstract_Class {
    public static void main(String[] args) {
        // Demonstrate abstract class functionality
        BikeAbs myBike = new HondaAbs(); // Upcasting to abstract type
        myBike.run(); // Calling implemented method

        // Demonstrate interface implementation
        Vehicle myCar = new Car(); // Using interface reference
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.stop();
    }
}
