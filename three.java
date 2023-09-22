/*
Q) What is Inheritance ?

Ans :- Inheritance is a process in which one object acquires all the properties and
behaviors of its parent object automatically. In such a way, you can reuse,
extend or modify the attributes and behaviors which are defined in other
classes.

Q) Why use inheritance in java ?

-> For Method Overriding (so runtime polymorphism can be achieved).
-> For Code Reusability.


** Types of inheritance in java ** 

single, multilevel and hierarchical.

In java programming, multiple and hybrid inheritance is supported through interface only. 

extends keyword is used in inheritance


*** IMP ***
Q) Why multiple inheritance is not supported in java?

-> To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the ** same method **  and you call it from child class object, there will be +++++ ambiguity++++  to call the method of A or B class.

Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error.

 */

//  Extra Topic :- Aggregation in Java
//  https://www.javatpoint.com/aggregation-in-java

class Animal {
    void eat() {
        System.out.println("Animal is Eating....");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking booww booww..");
    }
}

class BabyDog extends Dog {
    void crying() {
        System.out.println("Baby dog is crying...");
    }
}

class Cat extends Animal{
    
    void eat(String name){
        System.out.println("Cat is eating");
    }
}


public class three {
    public static void main(String[] args) {

        // single
        // Dog puppy = new Dog();
        // puppy.bark();
        // puppy.eat();

        // multilevel
        // BabyDog puppy = new BabyDog();
        // puppy.crying();
        // puppy.bark();
        // puppy.eat();

        // hierarchical
        Cat c = new Cat();
        c.eat("Miyoni");
        c.eat();
    }
}
