/*
    -> An interface in Java is a blueprint of a class. 
    -> It has static constants and abstract methods.
    -> Is a mechanism to achieve abstraction.
    -> Is a mechanism to achieve multiple inheritance in Java.


    ** In other words, you can say that interfaces can have abstract methods and variables. **
    ** It cannot have a method body. **
 */

/*
   Why use Java interface?

   1) It is used to achieve abstraction.
   2) By interface, we can support the functionality of multiple inheritance.
   3) It can be used to achieve loose coupling.

*/

/*
    The relationship between classes and interfaces

            extends
    class ------------> class

            implements
    class ------------> interface

                extends
    interface ------------> interface


*/

/*
interface printable{
    void print();
}


class Learn_Interface implements printable{
    public void print(){
            System.out.println("Hello printable");
        }
    public static void main(String[] args) {
        
        Learn_Interface obj = new Learn_Interface();
        obj.print();
    }

}

*/

/*
 -> In a real scenario, an interface is defined by someone else, 
 -> but its implementation is provided by different implementation providers. -> Moreover, it is used by someone else. 
 ->The implementation part is hidden by the user who uses the interface.

*/

/* 

// Interface declartion : by 1st user
interface Drawable {
    void draw();
}

// Implementation : by second user

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing reactangle ");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing circle..");
    }
}

// Using interface : by 3rd user

public class Learn_Interface {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}

*/

// Multiple inheritance in Java by interface
// If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.

// Q) Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
// Ans :- because of ambiguity . However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class.

// Example

interface printable {
    void print();
}

interface showable {
    void show();
}

public class Learn_Interface implements printable, showable {
    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Learn_Interface obj = new Learn_Interface();
        obj.show();
    }
}