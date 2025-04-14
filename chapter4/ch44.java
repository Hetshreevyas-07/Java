package chapter4;

public class ch44 {
//     Inheritance means one class can use the properties and methods of another class.

// In Java:
  
// The child class (subclass) inherits from the parent class (superclass).

// It helps in code reuse and method overriding.

// Real-Life Example:

// 👩‍🏫 Suppose you are a student and your mother is a human.

// You inherit qualities like eyes, heart, brain from your parent.

// Similarly, a Student class can inherit from a Human class in Java.
public static void main(String[] args) {
    Student s1 = new Student();
    s1.showDetails(); 
}

}

class Human {
    String eyes = "Brown eyes";
    String heart = "Healthy heart";

    void think() {
        System.out.println("Humans can think with their brain.");
    }

    void walk() {
        System.out.println("Humans can walk.");
    }
}

// Child class
class Student extends Human {
    String studentID = "S123";

    void study() {
        System.out.println("Student is studying.");
    }

    void showDetails() {
        // Accessing inherited features
        System.out.println("Eye color: " + eyes);
        System.out.println("Heart status: " + heart);
        think();  // inherited method
        walk();   // inherited method
        study();  // child’s own method
        System.out.println("Student ID: " + studentID);
    }
}

// Types of Inheritance in Java:
// Type	Description	Supported in Java
// Single   	    One child inherits one parent	✅ Yes
// Multilevel   	Child → Parent → Grandparent	✅ Yes
// Hierarchical 	Many children from one parent	✅ Yes
// Multiple     	One child, many parents	❌ Not directly
// Hybrid	        Combination of above	❌ Not directly

// Summary:
// Term	Meaning
// extends	Keyword used for inheritance
// Parent class	Class being inherited
// Child class	Class that inherits from parent
// Advantage	Code reusability, better structure