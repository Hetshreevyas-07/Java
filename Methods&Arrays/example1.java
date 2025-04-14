

// method is a group or block of code which take input from the user , processed it and give us output...it runs only when it is called

// Types of method is Pre-defined method and User defined method 
// Predefined is inbuilt method meand print(); sort(); and userdefined method is add(); sub(); etc...

// Syntax is  returntype function name (parameters)
// {
    //  statements;
// }  

// Why we use methods? because it decrease the line of code and ensure readability and repeatation
import java.util.Scanner;
public class example1{
    public static void main(String[] args) {
        example1 ex1 = new example1();
        ex1.display();
        int sum = ex1.add(5,10);  // Store returned sum
        System.out.println("Sum = " + sum);  // Print sum
    }
    void display()
    {
        System.out.println("hello from hetshree vyas...");
    }

    // for sum 

    int add(int a , int b)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        a = sc.nextInt();
        System.out.println("Enter value of b:");
        b = sc.nextInt();
        sc.close();
        return a+b;
    }
}
