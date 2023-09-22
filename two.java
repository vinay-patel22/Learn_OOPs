/*

1) Constructor : Constructor is a special method which is invoked
                automatically at the time of object creation. It is used to initialize the data
                members of new objects generally.

    ● Constructors have the same name as class or structure.
    ● Constructors don’t have a return type.(Not even void)
    ● Constructors are only called once, at object creation.

2) There can be three types of constructors in Java

1. Non-Parameterized constructor : A constructor which has no
argument is known as non-parameterized constructor(or no-argument
constructor). 
-> It is invoked at the time of creating an object. 
->If we don’t create one then it is created by default by Java.

2. Parameterized constructor : A constructor which has a specific number of parameters is called a parameterized constructor.

Why use the parameterized constructor?

-> The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

3. Copy Constructor : A Copy constructor is an overloaded
constructor used to declare and initialize an object from another
object. 
-> There is only a user defined copy constructor in Java(C++ has a
default one too).

** There are many ways to copy the values of one object into another in Java. They are:

    By constructor
    By assigning the values of one object into another
    By clone() method of Object class

 */

/* 

Note : Unlike languages like C++ , Java has no Destructor. Instead, Java has an efficient garbage collector that deallocates memory
automatically .

*/

// Example of default constructor (Non-Parameterized constructor)
class bike1 {

    // If there is no constructor in a class, compiler automatically creates a
    // default constructor.

    /*
      Q) What is the purpose of a default constructor?
      -> The default constructor is used to provide the default values to the
      -> Object like 0, null, etc., depending on the type.
     */
    bike1() {
        System.out.println("Bike is created");
    }
}

// Example of parameterized constructor

class Student1 {
    String name;
    int id;

    Student1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayData() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
    }
}

class Student2 {
    String name;
    int id;

    Student2(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Student2(Student2 s2) {
        this.name = s2.name;
        this.id = s2.id;
    }

    public void displayData() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
    }
}

public class two {
    public static void main(String[] args) {
        // bike1 b1 = new bike1(); //default constructor

        // Parameterized constructor
        // Student1 s1 = new Student1("Vinay", 42);
        // Student1 s2 = new Student1("Patel", 41);
        // s1.displayData();
        // s2.displayData();

        // Parameterized constructor
        Student2 s1 = new Student2("Vinay", 42);
        Student2 s2 = new Student2(s1);
        s1.displayData();
        s2.displayData();
    }
}
