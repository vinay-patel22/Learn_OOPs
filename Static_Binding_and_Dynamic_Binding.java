// Static Binding (Early Binding) Example: 
// When type of the object is determined at compile-time, it is known as static binding.
// This is typically for methods that are final, private, or static, where the compiler knows the method to call at compile-time.

class Dog1 {
    // Static Binding: The method is known at compile-time, as it's not overridden.
    void eat() {
        System.out.println("dog is eating...");
    }
}

// Dynamic Binding (Late Binding) Example:
// When the method to be executed is determined at runtime based on the object’s
// actual type.
class Animal1 {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Puppy1 extends Animal1 {
    // Overriding the eat method in the subclass causes dynamic binding.
    void eat() {
        System.out.println("Puppy is eating...");
    }
}

public class Static_Binding_and_Dynamic_Binding {
    public static void main(String[] args) {

        // Static Binding Example:
        // The method call d1.eat() is bound to the Dog1 class's eat() method at
        // compile-time.
        Dog1 d1 = new Dog1();
        d1.eat(); // Output: dog is eating...

        // Dynamic Binding Example:
        // Here, the reference is of type Animal1, but the actual object is of type
        // Puppy1.
        // The method call a1.eat() will invoke the overridden method in Puppy1 at
        // runtime, not the one in Animal1.
        Animal1 a1 = new Puppy1();
        a1.eat(); // Output: Puppy is eating...

        // Example of dynamic binding with Animal1 reference and Puppy1 object:
        // The decision of which eat() method to call happens at runtime,
        // because Puppy1 overrides the eat() method of Animal1.
    }
}
