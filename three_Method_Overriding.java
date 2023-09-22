/*

Method overriding is used for runtime polymorphism

Simple Meaning :- Same name , Same parameter ,but different return type.
-> Must be a different return type 
-> Used in Inheritance

Def:- If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.


Q) Can we override static method ?
-> No, a static method cannot be overridden. 
-> It can be proved by runtime polymorphism.

Q) Why can we not override static method ?
-> It is because the static method is bound with class whereas instance method is bound with an object. 
-> Static belongs to the class area, and an instance belongs to the heap area.

Q) Can we override java main method ?
-> No, because the main is a static method.

 */

//  A real example of Java Method Overriding

class Bank {
    public int getROI() {
        return 0;
    }
}

class SBI extends Bank {
    public int getROI() {
        return 8;
    }
}

class ICICI extends Bank {
    public int getROI() {
        return 7;
    }
}

class MahesanaUrbanBank extends Bank {
    public int getROI() {
        return 10;
    }
}

public class three_Method_Overriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        MahesanaUrbanBank mub = new MahesanaUrbanBank();

        System.out.println("SBI Rate Of Interest :- " + s.getROI());
        System.out.println("ICICI Rate Of Interest :- " + i.getROI());
        System.out.println("Mahesana Urban Bank Rate Of Interest :- " + mub.getROI());
    }
}
