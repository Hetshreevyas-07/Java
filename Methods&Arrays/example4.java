//lifetime of variable is known as scope
//scope=lifetime
//the area under which a variable is applicable
//a block or a region where a variable is declared,defined and used and when block or a region ends variable is automatically destroyedS


//three types of variable

//local variable: a variable which is declared inside the body of the method or the method parameter called local variable
//syntax is :
// void fun(int x)//method paramters
// {
//     int x;//local var
// }

//Instance variable : a variable which is declared inside the class but outside the method
//syntax : class a 
//      {
      //int a; //instance variable 
//    }

//static variable : a var declared using static keyword
 //syntax: static int x;

public class example4 {
    int c=30; //instance variable
    static int b = 77;//static variable
    public static void main(String[] args) {
        //we have to create object for accessing instance variable
        example4 ex4 = new example4();
        int a = 7; //local variable
        System.out.println("local variable is:" +a);
        System.out.println("static variable is : " + example4.b);
        System.out.println("instance variable is:" +ex4.c);
    }
}
