/*
Method Overriding in Java:
- Method overriding is used to achieve **runtime polymorphism**.
- It occurs when a subclass provides a specific implementation for a method that is already defined in its parent class.
- The overriding method in the child class must have:
    - The same method name.
    - The same parameter list (method signature).
    - The same return type (or a subtype of the return type, known as covariant return type).

Why can’t static methods be overridden?
- Static methods are **bound with the class**, not with the instance (object).
- They are resolved at compile-time, not runtime, which is why they cannot be overridden like instance methods.
- **Static methods are method-specific to the class**, while **instance methods** are resolved based on the object at runtime.

Can the main method be overridden in Java?
- No, because the `main` method is static, and static methods cannot be overridden. The `main` method is used as an entry point for a Java application, and it is bound to the class rather than to an instance.

Real-life example of Method Overriding:
- The `getROI()` method is overridden in different subclasses of the `Bank` class to return different rates of interest for various banks.
*/

class Bank {
    // Method in the parent class
    public int getROI() {
        return 0; // Default Rate of Interest for generic bank
    }
}

class SBI extends Bank {
    // Overriding the getROI method in SBI class
    public int getROI() {
        return 8; // SBI's Rate of Interest
    }
}

class ICICI extends Bank {
    // Overriding the getROI method in ICICI class
    public int getROI() {
        return 7; // ICICI's Rate of Interest
    }
}

class MahesanaUrbanBank extends Bank {
    // Overriding the getROI method in MahesanaUrbanBank class
    public int getROI() {
        return 10; // Mahesana Urban Bank's Rate of Interest
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        // Creating objects of each subclass
        SBI sbiBank = new SBI();
        ICICI iciciBank = new ICICI();
        MahesanaUrbanBank mubBank = new MahesanaUrbanBank();

        // Calling the overridden getROI() methods
        System.out.println("SBI Rate Of Interest: " + sbiBank.getROI()); // Output: 8
        System.out.println("ICICI Rate Of Interest: " + iciciBank.getROI()); // Output: 7
        System.out.println("Mahesana Urban Bank Rate Of Interest: " + mubBank.getROI()); // Output: 10
    }
}
