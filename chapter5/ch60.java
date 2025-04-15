package chapter5;

public class ch60 {
//     What is instanceof?
// instanceof is a Java keyword used to check if an object belongs to a specific class or subclass.

// It returns true if the object is an instance of that class (or subclass), otherwise false.

//syntax is : object instanceof ClassName

// Why Use instanceof?
// To safely downcast an object (avoid ClassCastException).

// To verify an object’s type at runtime.

// Helps in writing type-safe code in inheritance and polymorphism.

public static void main(String[] args) {
    Animal a = new Dog();  // Upcasting

    // Using instanceof before downcasting
    if (a instanceof Dog) {
        Dog d = (Dog) a; // Safe downcasting
        d.bark();
    } else {
        System.out.println("Not a Dog");
    }
}
}

// Points to Remember:
// instanceof avoids runtime type-casting errors.

// Works only for object references, not primitive data types.

// Also returns true if the object is an instance of a subclass of the given class.

// null instanceof ClassName will always return false.
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
