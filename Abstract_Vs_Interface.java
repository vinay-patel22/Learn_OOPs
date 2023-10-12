// Both are used to achieve abstraction
/*

Feature                                     | Abstract Class                               | Interface
--------------------------------------------------------------------------------------------------------------
1. Method Types                            | Can have abstract and non-abstract methods   | Can have only abstract methods. Since Java 8, it can have default and static methods also.
--------------------------------------------------------------------------------------------------------------
2. Multiple Inheritance                    | Doesn't support multiple inheritance         | Supports multiple inheritance.
--------------------------------------------------------------------------------------------------------------
3. Variable Types                          | Can have final, non-final, static, and non-static variables | Has only static and final variables.
--------------------------------------------------------------------------------------------------------------
4. Implementation of Interfaces           | Can provide the implementation of an interface | Can't provide the implementation of an abstract class.
--------------------------------------------------------------------------------------------------------------
5. Keyword Usage                           | Uses the "abstract" keyword to declare       | Uses the "interface" keyword to declare
--------------------------------------------------------------------------------------------------------------
6. Inheritance and Extension              | Can extend another Java class and implement multiple Java interfaces | Can extend another Java interface only.
--------------------------------------------------------------------------------------------------------------
7. Syntax for Extension/Implementation     | Extended using the "extends" keyword        | Implemented using the "implements" keyword.
--------------------------------------------------------------------------------------------------------------
8. Access Modifiers                        | Can have class members with various access modifiers (private, protected, etc.) | Members of a Java interface are public by default.
--------------------------------------------------------------------------------------------------------------
9. Example                                 | Example of an abstract class:                | Example of an interface:
                                           | public abstract class Shape{                | public interface Drawable{
                                           |    public abstract void draw();             |    void draw();
                                           | }                                         | }
--------------------------------------------------------------------------------------------------------------

*/

// Example of abstract class and interface in Java


interface A{
    void a(); // bydefault,public and abstract
    void b();
    void c();
    void d();
}

abstract class B implements A{
    public void c(){
        System.out.println("I am C in abstract class");
    }
}

class M extends B{
    public void a(){
        System.out.println("I am A");
    }
    public void b(){
        System.out.println("I am b");
    }  
    public void d(){
        System.out.println("I am d");
    }  
}
public class Abstract_Vs_Interface {
    public static void main(String[] args) {
        A obj = new M();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
    }

}