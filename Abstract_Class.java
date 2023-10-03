/* 
-> A class which is declared with the abstract keyword is known as an abstract class in Java. 
-> It can have abstract and non-abstract methods (method with the body).

->Abstraction is a process of hiding the implementation details and showing only functionality to the user.


There are two ways to achieve abstraction in java

1) Abstract class (0 to 100%)
2) Interface (100%)

*/

/*
    Abstract class in Java

    -> A class which is declared as abstract is known as an abstract class. 
    -> It can have abstract and non-abstract methods.
    -> It needs to be extended and its method implemented. 
    -> It cannot be instantiated.


    Points to Remember

    -> An abstract class must be declared with an abstract keyword.
    -> It can have abstract and non-abstract methods.
    -> It cannot be instantiated.
    -> It can have constructors and static methods also.
    -> It can have final methods which will force the subclass not to change the body of the method.

    Example of abstract class

    -> abstract class A{}  

    Example of abstract method

    -> abstract void printStatus();//no method body and abstract  
 */

 /*
    -> Rule: If there is an abstract method in a class, that class must be abstract.

    -> Rule: If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract.
  */

abstract class BikeAbs{
    abstract void run();
}
class HondaAbs extends BikeAbs{
    void run(){
        System.out.println("Running Safely");
    }
}


/* 
    Interface

    -> The abstract class can also be used to provide some implementation of the   interface. 
    -> In such case, the end user may not be forced to override all the methods of the interface.


 */

interface A{
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A{
    public void c(){
        System.out.println("I AM C");
    }
}
class MyClass extends B{
    public void a(){
        System.out.println("I AM A");
    }
    public void b(){
        System.out.println("I AM B");
    }
    public void d(){
        System.out.println("I AM D");
    }
}
class Abstract_Class{
    public static void main(String[] args) {
        // BikeAbs honda= new HondaAbs();
        // honda.run();

        A a = new MyClass();
        a.a();
        a.b();
        a.c();
        a.d();
    }

}