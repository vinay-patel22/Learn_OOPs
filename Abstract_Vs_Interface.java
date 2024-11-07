/* 
    This code demonstrates the differences between abstract classes and interfaces in Java.

    Feature Comparison:
    
    1. Method Types:
       - Abstract classes can have both abstract and non-abstract methods.
       - Interfaces can only have abstract methods by default but, since Java 8, they can have default and static methods.

    2. Multiple Inheritance:
       - Abstract classes don't support multiple inheritance.
       - Interfaces do support multiple inheritance.

    3. Variable Types:
       - Abstract classes can have final, non-final, static, and non-static variables.
       - Interfaces only allow static and final variables.

    4. Implementation:
       - Abstract classes can implement interfaces.
       - Interfaces cannot provide the implementation of an abstract class.

    5. Keyword Usage:
       - Abstract classes use the "abstract" keyword.
       - Interfaces use the "interface" keyword.

    6. Access Modifiers:
       - Abstract class members can have various access modifiers.
       - Interface members are `public` by default.

*/

// Interface example: Defines four abstract methods (implicitly public and abstract)
interface Action {
    void actionA();

    void actionB();

    void actionC();

    void actionD();
}

// Abstract class example: provides partial implementation of the Action
// interface
abstract class PartialAction implements Action {
    // Implementing one of the methods
    public void actionC() {
        System.out.println("I am actionC in the abstract class PartialAction");
    }
    // Other methods remain abstract and must be implemented by any concrete
    // subclass
}

// Concrete class implementing all remaining methods of the Action interface
class ConcreteAction extends PartialAction {
    // Providing implementation for the remaining abstract methods
    public void actionA() {
        System.out.println("I am actionA");
    }

    public void actionB() {
        System.out.println("I am actionB");
    }

    public void actionD() {
        System.out.println("I am actionD");
    }
}

// Main class to test the interface and abstract class
public class Abstract_Vs_Interface {
    public static void main(String[] args) {
        // Using polymorphism to refer to the ConcreteAction object with an Action
        // interface reference
        Action action = new ConcreteAction();

        // Calling the methods to show interface and abstract class functionality
        action.actionA();
        action.actionB();
        action.actionC();
        action.actionD();
    }
}
