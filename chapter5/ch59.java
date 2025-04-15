package chapter5;

public class ch59 {
 // What is Casting Objects?
// Casting objects means converting one object type into another within the same class hierarchy (i.e., parent-child relationship).

// Easy Explanation with Points:
// Object Casting = Type Conversion of Objects
// Like converting int to float, we can also convert one object type to another (if they’re related).

// Happens in Inheritance
// Object casting is only possible when classes are related through inheritance (i.e., parent ↔ child classes).

// Two Types of Object Casting:

// Upcasting

// Downcasting

// Upcasting (Safe & Automatic)
// Upcasting = Child to Parent

// You treat a child object as if it's a parent object.

// ✅ Automatically done by Java/C++/other languages.

// Why use Upcasting?

// Helps in writing general code using polymorphism. 

// Downcasting (Risky & Manual)
// Downcasting = Parent to Child

// You forcefully treat a parent reference as a child object.

// ❌ Must be done manually using a cast.

// ⚠️ Risky: Can throw runtime error if the actual object is not of child type.

public static void main(String[] args) {
    double d = 4.5;
//     int i = d; if i want to convert double to int that's not possible
//this is called type mismatched error
 int i = (int) d; //this is called casting 
 System.out.println(i);
    A obj = new A();
    obj.show();
    //here you can see we can only call show method not show2 reason is
    // class a doesn't know that class b exist b knows what a is but a doesn't what b is
    //so we can write 
    A o = (A) new B();
    //we have an object of subclass then we are trying to assign that to a pattern class
    //now we can actually  say hey you know what can you do please typecast it

}
 }

 class A {
    public void show() {
        System.out.println("class a's method");
    }
    
 }

 class B extends A {
    public void show2(){
        System.out.println("class b's method");
    }
    
 }
