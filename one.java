// Class , Object , this

/*

1) What is a class in Java

-> A class is a group of objects which have common properties. 
-> It is a template or blueprint from which objects are created. 
-> It is a logical entity. It can't be physical.

-> A class in Java can contain:

    Fields
    Methods
    Constructors
    Blocks
    Nested class and interface


2) What is an object in Java



-> An entity that has state and behavior is known as an object 
-> e.g., chair, bike, marker, pen, table, car, etc. 

  An object has 3 characteristics:

a) State: represents the data (value) of an object.
b) Behavior: represents the behavior (functionality) of an object such as deposit, withdraw, etc.
c) Identity: It is used internally by the JVM to identify each object uniquely.

-> An object is an instance of a class. 
-> A class is a template or blueprint from which objects are created. 
-> So, an object is the instance(result) of a class.


Object Definitions:

An object is a real-world entity.
An object is a runtime entity.
The object is an entity which has state and behavior.
The object is an instance of a class. 

 */

/* 

Note : When an object is created using a new keyword, then space is
allocated for the variable in a heap, and the starting address is stored in
the stack memory

*/
/*
   
‘this’ keyword : ‘this’ keyword in Java that refers to the current
instance of the class. In OOPS it is used to:
1. pass the current object as a parameter to another
method
2. refer to the current class instance variable

*/

class Student {
    String name;
    int age;

    public void getStudentInfo() {
        System.out.println("Student name : " + this.name);
        System.out.println("Student age : " + this.age);
    }
}

class one {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vinay";
        s1.age = 21;
        s1.getStudentInfo();
    }
}