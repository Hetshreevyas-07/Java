package chapter5;
// Super Class
class Animal {
    String color = "Brown";

    // Constructor
    Animal() {
        System.out.println("Animal constructor called");
    }

    // Method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Sub Class
class Dog extends Animal {
    String color = "Black";

    // Constructor
    Dog() {
        super();  // 1️⃣ Calls the parent class constructor
        System.out.println("Dog constructor called");
    }

    // Method overriding
    void sound() {
        super.sound();  // 2️⃣ Calls the parent class method
        System.out.println("Dog barks");
    }

    // Method to show color variables
    void printColor() {
        System.out.println("Dog color: " + color);
        System.out.println("Animal color: " + super.color);  // 3️⃣ Accesses the parent class variable
    }
}


public class ch57 {
    //super keyword

    //super keyword refers to the objects of super class . it is used when
    //we want to call the super class variable method & constuctor through sub class object
    //whenever super and sub class variable both are same than it can be used only
    //to avoid the confusion between super and sub class variables and methods that have same name 

// super is a keyword in Java.

// It refers to the immediate parent class of the current class.

// Used in inheritance when a subclass wants to access or refer to something in its superclass.

// 1. To Call Super Class Constructor
// Used to call the constructor of the parent class from the child class.

// It must be the first statement in the subclass constructor.
public static void main(String[] args) {
    Dog d = new Dog();         // Constructor call
    d.sound();                 // Method call
    d.printColor();           // Accessing variables
}
}

