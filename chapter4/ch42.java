 package chapter4;

     //what is polymorphism
    //means many forms
    //it allows one thing like a method to behave differently based on the object or situation

    //two types of polymorphism
    //compile time and runtime
    //compile time also known as method overloading
    //runtime also known as method overriding

    //compile time or methodoverloading 

    // when multiple methods in same class but different parameters

//     Run-time Polymorphism (Method Overriding)

// When child class has the same method as in the parent class, but it behaves differently.

public class ch42 {
        public static void main(String[] args) {
            math m = new math();
            //object crreated
            System.out.println(m.add(7, 5));
            System.out.println(m.add(7, 7, 7));
  //here you can see we created a class named math it has two methods
        //both method name is same but paramters are different
        //first add has two paramters and 2nd add has three paramters
        Animal s = new Dog();
        Animal a = new Animal();
        a.sound();
        s.sound();
        }
       

}

class math {
    int add(int a, int b)
    {
        return a+b;
    }
   int add(int a, int b, int c)
   {
    return a+b+c;
   }
}

class Animal {
    void sound() {
        System.out.println("animal makes sound");
    }
}
//here parent class is animal and child class is dog both has same method name

class Dog extends Animal {
    void sound()
    {
        System.out.println("Dog barks!");
    }
} 