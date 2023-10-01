// The instanceof in java is also known as type comparison operator because it compares the instance with type.

// The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).

// It returns either true or false.

// If we apply the instanceof operator with any variable that has **null** value, it returns **false**.

// Understanding Real use of instanceof in java

interface Printable {
}

class A implements Printable {
    public void a() {
        System.out.println("a method");
    }
}

class B implements Printable {
    public void b() {
        System.out.println("b method");
    }
}

class Call {
    void invoke(Printable p) {// upcasting
        if (p instanceof A) {
            A a = (A) p;// Downcasting
            a.a();
        }
        if (p instanceof B) {
            B b = (B) p;// Downcasting
            b.b();
        }

    }
}// end of Call class

public class Java_instanceof_operator {
    public static void main(String[] args) {
        // Java_instanceof_operator jio = new Java_instanceof_operator();
        // System.out.println(jio instanceof Java_instanceof_operator); //true

        // Java_instanceof_operator jio = null;
        // System.out.println(jio instanceof Java_instanceof_operator); // false

        Printable p = new B();
        Call c = new Call();
        c.invoke(p);

    }
}
