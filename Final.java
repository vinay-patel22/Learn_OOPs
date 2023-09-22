/*

-> The final keyword in java is used to restrict the user. 
-> The java final keyword can be used in many context. 
-> Final can be :-
    variable
    method
    class

    // We can not change things inside variable or methods or class

Q) Is final method inherited?
-> Yes, final method is inherited but you cannot override it.


Q) Can we initialize blank final variable?
-> But only in constructor.

Q) static blank final variable
->A static final variable that is not initialized at the time of declaration is known as static blank final variable. It can be initialized only in static block.

Q) Can we declare a constructor final?
-> No, because constructor is never inherited.
 */

class Bike {
    final int price = 78000;

    void discount() {
        price = 55000;
    }

    final void run() {
        System.out.println("Running...");
    }
}

class Honda extends Bike {
    void run() {
        System.out.println("High speed ! 100 !!!");
    }
}

final class Bike1 {
}

class Honda1 extends Bike1 {
    void run() {
        System.out.println("High speed ! 100 !!!");
    }
}

class BikeInherit {
    final void run() {
        System.out.println("Running !!");
    }
}

public class Final extends BikeInherit {
    public static void main(String[] args) {
        // Bike b1 = new Bike();
        // b1.discount(); // Compile Time Error

        // Honda h1 = new Honda();
        // h1.run(); //// Compile Time Error

        // Honda1 h1 = new Honda1();
        // h1.run();

        new Final().run();
    }
}
