package chapter5;

public class ch56 {
//  Super Class and Sub Class in Java (Detailed Explanation)

//  What is a Super Class?

// A super class is a class that is inherited by another class.

// It is also called the parent class or base class.

// It contains common properties and methods that can be reused by its subclasses.

// It helps in code reusability and reducing redundancy.

//  What is a Sub Class?

// A sub class is a class that inherits from a super class.

// It is also called the child class or derived class.

// It gets access to all non-private members (methods and variables) of the super class.

// It can also have its own additional methods or properties.

// It can override methods of the super class if needed.

//  Relationship: is-a

// A subclass is a type of superclass.

// Example: Dog is an Animal, Car is a Vehicle.

//  Real-Life Analogy:

// Super Class: Vehicle → all vehicles have wheels, engine, and can move.

// Sub Class: Car → it's a vehicle, but it also has extra features like AC, stereo, etc.

public static void main(String[] args) {
    Dog d = new Dog();     // Creating object of subclass
    d.eat();               // Method from superclass
    d.sleep();             // Method from superclass
    d.bark();              // Method from subclass
}

}

// Super Class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Sub Class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
