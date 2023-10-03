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