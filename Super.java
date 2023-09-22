/*

-> The super keyword in Java is a reference variable which is used to refer immediate parent class object.

-> Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

** Usage of Java super Keyword **

-> refer immediate parent class instance variable
-> invoke immediate parent class method
-> super() can be used to invoke immediate parent class constructor.


Note: super() is added in each class constructor automatically by compiler if there is no super() or this().

 */


class Animal {
    String color = "White";

    void eat(){
        System.out.println("Animal class is eating...");
    }
    Animal(){
        System.out.println("Animal is crated..");
    }
}

class Dog extends Animal {
    String color = "Black";
    void eat(){
        System.out.println("Dog class is eating...");
    }
    void bark(){
        System.out.println("Dog is barking...");
    }
    void work(){
        super.eat();
        bark();
    }
    void printColor() {
        System.out.println(color);// prints color of Dog class
        System.out.println(super.color);// prints color of Animal class
    }
    Dog(){
        super(); // If we comment this things and still is work beacuse compiler is doing by default.
        System.out.println("Dog is created..");
    }
}

// Real Life Example

class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person{
    float salary;
    Emp(int id,String name,float salary){
        super(id, name); // reusing parent constructor
        this.salary = salary;
    }

    void printDetails(){
        System.out.println("ID :- " + id);
        System.out.println("Name :- " + name);
        System.out.println("Salary :- " + salary);
    }
}
public class Super {
    public static void main(String[] args) {
        // Dog d = new Dog();
        // d.printColor();
        // d.work();

        Emp e1 = new Emp(1, "Vinay", 55000f);
        e1.printDetails();
    }
}
