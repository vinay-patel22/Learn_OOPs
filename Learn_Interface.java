/*
    -> An interface in Java is a blueprint of a class, containing static constants and abstract methods.
    -> Interfaces are used to achieve abstraction and provide support for multiple inheritance.
    -> They are also used to achieve loose coupling between classes by defining expected behavior without specifying the implementation.

    Key Characteristics:
    - An interface can only have abstract methods (Java 8+ also allows default and static methods).
    - All variables declared in an interface are implicitly `public`, `static`, and `final`.
    - Interfaces cannot contain concrete (non-abstract) method implementations (except for `default` and `static` methods in Java 8+).
*/

/*
    Why use Java interfaces?

    1) Achieve abstraction by defining a contract of methods that implementing classes must fulfill.
    2) Enable multiple inheritance by allowing a class to implement multiple interfaces.
    3) Promote loose coupling, where the implementation details of a class are hidden behind an interface.
*/

/*
    Relationship between classes and interfaces:

            extends
    class ------------> class

            implements
    class ------------> interface

                extends
    interface ------------> interface
*/

/*
interface printable {
    void print();
}

class Learn_Interface implements printable {
    public void print() {
        System.out.println("Hello from printable interface");
    }

    public static void main(String[] args) {
        Learn_Interface obj = new Learn_Interface();
        obj.print(); // Demonstrates implementation of the interface method
    }
}
*/

/*
 -> In real-world scenarios, interfaces are often defined by someone else, 
 -> with different classes providing their own implementations of the interface.
 -> This way, the implementation details are hidden from users of the interface, promoting loose coupling.
*/

// Interface declaration by a "first" user
interface Drawable {
    void draw();
}

// Implementation of Drawable interface by a "second" user

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing rectangle...");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing circle...");
    }
}

// Using interface by a "third" user

public class Learn_Interface implements printable, showable {
    // Multiple inheritance through interfaces

    public void print() {
        System.out.println("Hello from printable interface");
    }

    public void show() {
        System.out.println("Welcome from showable interface");
    }

    public static void main(String[] args) {
        Learn_Interface obj = new Learn_Interface();

        // Demonstrating multiple inheritance through interfaces
        obj.print(); // Calls print() method from printable interface
        obj.show(); // Calls show() method from showable interface

        // Using the Drawable interface
        Drawable drawable1 = new Circle(); // Polymorphic reference to Circle instance
        drawable1.draw();

        Drawable drawable2 = new Rectangle(); // Polymorphic reference to Rectangle instance
        drawable2.draw();
    }
}

/*
 * Explanation of Multiple Inheritance via Interfaces:
 * 
 * - Java does not support multiple inheritance with classes due to ambiguity
 * issues (e.g., if two superclasses have methods with the same name).
 * - However, it does allow multiple inheritance via interfaces, as there’s no
 * ambiguity in implementation.
 * - Each class implementing the interface provides its own method definitions,
 * so no conflicting implementation occurs.
 */
