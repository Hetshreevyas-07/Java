package chapter4;


public class ch43 {
    //A constructor is a special method in a class that is automatically called when you create an object.
//      Key Points:
// It has the same name as the class.

// It doesn't have a return type (not even void).

// It is used to initialize objects (i.e., set values).

// Types of Constructors:
// Default Constructor – No parameters

// Parameterized Constructor – With parameters
public static void main(String[] args) {
    Student s1 = new Student(); 
    System.out.println(s1);
     // Constructor is called automatically   
     Student1 s = new Student1("Hetshree", 18);  // values passed
     s.display();

    }
}

class Student {
    // Default constructor
    Student() {
        System.out.println("Student object is created!");
        
    }
}

//paramtered constuctor

class Student1 {
    String name;
    int age;

    // Parameterized constructor
    Student1(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Feature	     Constructor	             Method
// Name     	    Same as class            name	Any name
// Return type	    No return type	          Has return type
// Called when	    Object is created	       Called manually
// Purpose	        Initializes the object	    Performs specific task
