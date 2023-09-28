/*
 -> The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

 -> There are two types of polymorphism in Java: 
    a) compile-time polymorphism (Method Overloading)
    b) runtime polymorphism (Dynamic Method Dispatch) (Inheritance) 
        ( Method Overriding)

 -> We can perform polymorphism in java by method overloading and method overriding.

 Rule: Runtime polymorphism can't be achieved by data members.


 */

/*
    Upcasting
    
    -> If the reference variable of Parent class refers to the object of Child class, it is known as upcasting.

class A{}  
class B extends A{}  
A a=new B();//upcasting  


 */
class Bike2 {
    void run() {
        System.out.println("Bike is running!");
    }
}

class Splendor extends Bike2 {
    void run() {
        System.out.println("Splendor is running safely");
    }
}

class NewBank {
    float getRateOfInterest() {
        return 0;
    }
}

class NewSBI extends NewBank {
    float getRateOfInterest() {
        return 8.4f;
    }
}

class NewICICI extends NewBank {
    float getRateOfInterest() {
        return 7.3f;
    }
}

class NewAXIS extends NewBank {
    float getRateOfInterest() {
        return 9.7f;
    }
}

// Shape Example

class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle...");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("drawing triangle...");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Bike2 b = new Splendor();// upcasting
        // b.run();

        // NewBank bank = new NewSBI();
        // System.out.println("SBI Rate of Interest: " + bank.getRateOfInterest());
        // bank = new NewICICI();
        // System.out.println("ICICI Rate of Interest: " + bank.getRateOfInterest());
        // bank = new NewAXIS();
        // System.out.println("AXIS Rate of Interest: " + bank.getRateOfInterest());

        Shape s;
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}
