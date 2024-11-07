/*
    The `instanceof` operator in Java is used as a type comparison operator.
    - It checks if an object is an instance of a specified class, subclass, or interface.
    - Returns `true` if the object is an instance of the specified type; otherwise, returns `false`.
    - Returns `false` when used on `null` values, as `null` is not an instance of any type.

    Use Case:
    - Often used before performing a cast to ensure that the object is of the correct type, avoiding `ClassCastException`.
 */

// Interface declaration
interface Printable {
}

// Class A implementing Printable with its unique method
class A implements Printable {
    public void a() {
        System.out.println("Executing method a() in class A");
    }
}

// Class B implementing Printable with its unique method
class B implements Printable {
    public void b() {
        System.out.println("Executing method b() in class B");
    }
}

// Class to invoke specific actions based on the type of Printable object passed
class ActionInvoker {
    // Method that invokes a specific method based on the object's actual type
    void invoke(Printable p) { // Upcasting
        // Check if p is an instance of A
        if (p instanceof A) {
            A a = (A) p; // Safe downcasting
            a.a();
        }
        // Check if p is an instance of B
        if (p instanceof B) {
            B b = (B) p; // Safe downcasting
            b.b();
        }
    }
}

public class Java_instanceof_operator {
    public static void main(String[] args) {
        // Example 1: Checking type of object with instanceof
        Java_instanceof_operator demo = new Java_instanceof_operator();
        System.out.println(
                "Is 'demo' an instance of Java_instanceof_operator? " + (demo instanceof Java_instanceof_operator)); // true

        // Example 2: Using instanceof with a null reference
        Java_instanceof_operator demoNull = null;
        System.out.println("Is 'demoNull' an instance of Java_instanceof_operator? "
                + (demoNull instanceof Java_instanceof_operator)); // false

        // Example 3: Using instanceof with interface and downcasting
        Printable printable = new B(); // Upcasting B to Printable
        ActionInvoker actionInvoker = new ActionInvoker();

        // Invoke the correct method based on the actual type of 'printable'
        actionInvoker.invoke(printable);
    }
}
