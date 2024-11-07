/*
    Method Overloading in Java:
    
    - Simple Meaning :- Same name but different parameters.
    
    - Method overloading occurs when a class has multiple methods with the same name but different parameters.
    - It increases the readability of the program by allowing methods to perform similar operations with different inputs.

    ** Key Points about Method Overloading **
    1) It can be done by changing the number of arguments in the method.
    2) It can also be done by changing the type of parameters.
    3) **Important**: Java does not allow overloading by only changing the return type of the method. The method signature must differ in parameter type or number.
    4) Overloading is resolved at **compile time**, not at runtime, which makes it safer than relying on runtime polymorphism.
*/

class Adder {
    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (overloading add method by changing the number
    // of arguments)
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloading method by changing the data type: method to add two double values
    static double add(double a, double b) {
        return a + b;
    }

    // Overloading with a different combination of argument types: int and double
    static double add(int a, double b) {
        return a + b;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        // Calling the method to add two integers
        System.out.println("Sum of two integers: " + Adder.add(11, 11));

        // Calling the method to add three integers
        System.out.println("Sum of three integers: " + Adder.add(11, 11, 11));

        // Calling the method to add two doubles
        System.out.println("Sum of two doubles: " + Adder.add(11.5, 11.5));

        // Calling the method to add an integer and a double
        System.out.println("Sum of int and double: " + Adder.add(10, 20.5));
    }
}

/*
 * Important Notes:
 * - Method overloading in Java allows the creation of multiple methods with the
 * same name but different parameters.
 * - **Overloading by return type alone is not allowed**. If you change only the
 * return type, the compiler will throw an error.
 * - Compile-time errors (like method signature conflicts) are better than
 * runtime errors because they are caught early during compilation.
 */
