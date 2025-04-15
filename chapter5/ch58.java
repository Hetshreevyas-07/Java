package chapter5;

public class ch58 {
    //Static binding and dynamic binding
    //What is Dynamic Binding?
// 🔹 Definition:
// Dynamic Binding (also called Late Binding) is when the method to be called is decided at runtime, not during compilation.
// In Java, if a method is overridden in a subclass...

// And you're using a parent class reference to point to a child class object...

// Then Java decides which method to call at runtime based on the object — not the reference type.

// This is called Dynamic Binding.

// Happens only with method overriding, not variables.

// Based on the actual object type, not the reference type.

// Used in Runtime Polymorphism.

// Imagine This:
// You have a remote (reference) that can control any smart device (actual object).

// You point the remote at:

// a Smart Fan → it turns on the fan.

// a Smart Light → it turns on the light.

// Even though you're using the same remote, the device (object) decides what to do.

// In Java terms:
// Remote = Parent class reference

// Device = Child class object

// Pressing "Turn On" = Calling method

// Result = Decided by actual device (object), not remote (reference)
public static void main(String[] args) {
    Animal a;      // reference of Animal (like a remote)

    a = new Dog(); // object is Dog
    a.speak();     // Output: Dog barks

    a = new Cat(); // object is Cat
    a.speak();     // Output: Cat meows
}
}

class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Cat meows");
    }
}
// So What is Dynamic Binding?
// The method speak() is decided at runtime based on the object (Dog or Cat).

// This is Dynamic Binding — the method is not fixed at compile time, 
// it's chosen when the program runs.
// "Java waits till the program runs to decide which method to call. That’s dynamic binding!"

