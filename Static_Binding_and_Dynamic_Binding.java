// Connecting a method call to the method body is known as binding.
// There are two types of binding

// Static Binding (also known as Early Binding).
// When type of the object is determined at compiled time, it is known as static binding.

// Dynamic Binding (also known as Late Binding).
// When type of the object is determined at run-time, it is known as dynamic binding.

// Example of static binding
class Dog1 {
    void eat() {
        System.out.println("dog is eating...");
    }

}

// Dynamic binding
class Animal1 {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Puppy1 extends Animal1 {
    void eat() {
        System.out.println("Puppy is eating...");
    }
}

public class Static_Binding_and_Dynamic_Binding {
    public static void main(String[] args) {
        // Dog1 d1 = new Dog1();
        // d1.eat();

        Animal1 a1 = new Puppy1();
        a1.eat();
    }

}
