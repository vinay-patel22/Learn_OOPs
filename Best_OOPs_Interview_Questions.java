/*
    1. What is Object Oriented Programming (OOPs)?

    - a programming paradigm.
    - where the complete software operates as a bunch of objects talking to each other.
    - An object is a collection of data and the methods which operate on that data.
    
    2. Why OOPs?

    - Understanding of the software is increased (as the distance between the language spoken by developers and that spoken by users)

    - Modularity and Reusability
    - Code Organization and Readability
    - Abstraction
    - Maintainability and Scalability

    3. What is a Class?

    - A class is a building block of Object Oriented Programs. 
    - It is like a blueprint or template of objects having common properties and methods.
    - It is a user-defined data type that contains the data members and member functions that operate on the data members. 

    4. What is an Object?

    - An object is an instance of a class. 
    - In simple terms, they are the actual world entities that have a state and behavior.

    - Data members and methods of a class cannot be used directly. We need to create an object (or instance) of the class to use them. 

    5. What are the main features of OOPs?
    
    - Inheritance
    - Polymorphism
    - Encapsulation
    - Data Abstraction

    6. What is Encapsulation?
    - Encapsulation is the binding of data and methods that manipulate them into a single unit such that the sensitive data is hidden from the users.
    It is implemented as the processes mentioned below:

    - Data hiding: A language feature to restrict access to members of an object. For example, private and protected members in C++.

    - Bundling of data and methods together: Data and methods that operate on that data are bundled together. For example, the data members and member methods that operate on them are wrapped into a single unit known as a class.

    7. What is Abstraction?

    - showing only the necessary information and hiding the other irrelevant information from the user
    - Abstraction is implemented using classes and interfaces.

8. What is Polymorphism?
    
    -The word “Polymorphism” means having many forms. 

    - Polymorphism can be classified into two types based on the time when the call to the object or function is resolved. They are as follows:

        - Compile Time Polymorphism
        - Runtime Polymorphism
        
        A) Compile-Time Polymorphism (static polymorphism or early binding)

            - Method overloading or operator overloading are examples of compile-time polymorphism.

        B) Runtime Polymorphism (dynamic polymorphism or late binding)

            - where the actual implementation of the function is determined during the runtime or execution. 
            
            -Method overriding is an example of this method.


 */

//  class definition
class StudentUrban {
    String studentName;
}

public class Best_OOPs_Interview_Questions {

    public static void main(String[] args) {

        // creating an object
        StudentUrban student1 = new StudentUrban();

        // assigning member some value
        student1.studentName = "Vinay Patel";

        System.out.println("Student1.studentName = " + student1.studentName);
    }
}

// Code Explation of point 6.

// Define a class named "BankAccount" to demonstrate encapsulation
class BankAccount {
    // Private data members (data hiding)
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the BankAccount object (bundling data and methods)
    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Public getter method to access account holder's name (providing controlled
    // access)
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Public getter method to access balance (providing controlled access)
    public double getBalance() {
        return balance;
    }

    // Public method to deposit an amount (bundled functionality)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw an amount (bundled functionality with restricted
    // access)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! New balance: $" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class Best_OOPs_Interview_Questions {

    public static void main(String[] args) {
        // Create a new BankAccount object
        BankAccount account = new BankAccount("Vinay Patel", 50000.0);

        // Access and display account details using public methods
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Modify the balance using the deposit and withdraw methods
        account.deposit(500.0); // Deposit amount
        account.withdraw(200.0); // Withdraw amount

        // Trying to access private data members directly would result in an error
        // account.balance = 2000; // Error: balance has private access in BankAccount

    }
}

// Code Explation of point 7.

// Example: Using Abstraction with an Abstract Class and Interface

// Abstract class to represent a generic BankAccount
abstract class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Abstract method for withdrawal (forcing subclasses to provide implementation)
    public abstract void withdraw(double amount);

    // Common method for depositing money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Getter method to retrieve the balance
    public double getBalance() {
        return balance;
    }

    // Protected method to adjust balance (accessible only within the package or
    // subclasses)
    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

// Interface to define additional bank operations
interface InterestBearingAccount {
    void applyInterest(); // Abstract method to apply interest
}

// Concrete class representing a SavingsAccount
class SavingsAccount extends BankAccount implements InterestBearingAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    // Implementation of abstract method withdraw
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful! New balance: $" + getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Implementation of the interface method applyInterest
    @Override
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
        System.out.println("Interest applied! New balance: $" + getBalance());
    }
}

/*
 * 
 * Key Points
 * 
 * - Abstraction hides unnecessary details (e.g., how interest is calculated)
 * and shows only essential features (e.g., applyInterest, deposit, withdraw).
 * 
 * -Abstract Classes and Interfaces provide a way to structure code with
 * necessary methods while hiding implementation specifics, allowing users to
 * interact only with the defined interface.
 */

public class Best_OOPs_Interview_Questions {

    public static void main(String[] args) {
        // Create a SavingsAccount object with an initial balance and interest rate
        SavingsAccount savings = new SavingsAccount(1000.0, 0.05);

        // Show balance, deposit, withdraw, and apply interest
        System.out.println("Initial Balance: $" + savings.getBalance());
        savings.deposit(200.0); // Deposit amount
        savings.withdraw(150.0); // Withdraw amount
        savings.applyInterest(); // Apply interest

    }
}



// Code explain point 8.

// A) Compile-Time Polymorphism (Method Overloading)

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

public class InnerBest_OOPs_Interview_Questions {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling different overloaded methods based on arguments
        System.out.println("Sum of two integers: " + calculator.add(5, 10)); // Calls add(int, int)
        System.out.println("Sum of three integers: " + calculator.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + calculator.add(5.5, 3.2)); // Calls add(double, double)

    }
}

// B) Runtime Polymorphism (Method Overriding)

// Base class
class Animal {
    // Method that can be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class Dog that overrides the sound() method
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class Cat that overrides the sound() method
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class InnerInnerBest_OOPs_Interview_Questions {

    public static void main(String[] args) {
        // Create Animal reference but Dog object
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Calls the overridden methods at runtime
        animal1.sound(); // Outputs: Dog barks
        animal2.sound(); // Outputs: Cat meows

    }
<<<<<<< HEAD
}
=======
}
>>>>>>> a0688579010fe6bd1b428a110fc71805e038260f
