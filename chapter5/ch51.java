package chapter5;


//abstract class and encapsulation
//the abstract class in java can't be instantiated
//means we can't create objects of abstract class

//a method that doesn't have its body is known as abstract method
//we can create subclasses from it
//we can access no. of abstract class using the object of the subclass
//if the abstract class includes any abstract method,then all the child 
//classes inherited from the abstract superclass must provide the implementation 

public class ch51 {
    public static void main(String[] args) {
        //vehicle v1 = new vehicle();// we got an error if we define abstract keyword
        Car c1 = new Car() {
            //no defined
        };
       c1.accelarate();
       c1.breakes(4);
    }
}

abstract class vehicle {
   abstract void accelarate();
    //we can't declare body of the abstract method ..
    //we can't use it like this accelarate {
    // system.out.println("hello!")
   // }
   abstract void breakes(int wheels);
}

abstract class Car extends vehicle {

    @Override //this is known as anotation  // this is optional..
    //this checks this perticular method is created on the above class or not

    void accelarate() {
        System.out.println("car is accelarating!");
    }

    @Override
    void breakes(int wheels) {
        System.out.println("breaks are working!");
    }
    
}