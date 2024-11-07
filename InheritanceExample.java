/*
Q) What is Inheritance ?

Ans :- Inheritance is a process in which one class (child or subclass) acquires all the properties and
behaviors (methods) of another class (parent or superclass) automatically. This allows code reusability,
method overriding, and the ability to extend or modify existing functionalities.

Q) Why use inheritance in Java ?

- **Code Reusability**: You can reuse methods and variables of an existing class without rewriting them.
- **Method Overriding**: Inheritance allows method overriding, which helps in achieving runtime polymorphism.
- **Extend or Modify Behaviors**: You can change or add new functionality to inherited methods in the child class.

Types of inheritance in Java:
- **Single Inheritance**: A class inherits from one parent class.
- **Multilevel Inheritance**: A class inherits from another class, which already inherits from another class.
- **Hierarchical Inheritance**: Multiple classes inherit from a single parent class.

Java does not support **Multiple Inheritance** directly to avoid ambiguity, especially if two parent classes have methods with the same signature.

In Java, multiple inheritance is supported through **Interfaces** only.
*/

class Animal {
    void eat() {
        System.out.println("Animal is Eating....");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking: woof woof...");
    }
}

class BabyDog extends Dog {
    void crying() {
        System.out.println("Baby dog is crying...");
    }
}

class Cat extends Animal {
    // Overloading the eat method to show different behavior based on parameters
    void eat(String food) {
        System.out.println("Cat is eating " + food);
    }

    // This eat method can be called if we just want a generic 'eat' action
    void eat() {
        System.out.println("Cat is eating food...");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {

        // Example of Single Inheritance
        Dog dog = new Dog();
        dog.bark(); // Dog-specific behavior
        dog.eat(); // Inherited behavior from Animal class

        // Example of Multilevel Inheritance
        BabyDog babyDog = new BabyDog();
        babyDog.crying(); // BabyDog-specific behavior
        babyDog.bark(); // Inherited from Dog class
        babyDog.eat(); // Inherited from Animal class

        // Example of Hierarchical Inheritance
        Cat cat = new Cat();
        cat.eat("fish"); // Calls overloaded method with parameter
        cat.eat(); // Calls the default eat method in Cat class
    }
}
