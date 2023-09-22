/*
Simple Meaning :- Same name but different parameters .
Note :- In Java, Method Overloading is not possible by changing the return type of the method only.

Def :- If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

** Advantage of method overloading ** 
Method overloading increases the readability of the program.

** Different ways to overload the method ** 

By changing number of arguments
By changing the data type


Note: Compile Time Error is better than Run Time Error. So, java compiler renders compiler time error if you declare the same method having same parameters.

 */

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
    }
}
