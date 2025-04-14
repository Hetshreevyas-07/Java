// what is array?

// array is an object in java which contains similar type of data in contiguous memory location

//why it is known as object just because when we declare it initiated with new keyword ...

//syntax : data type [] var name; 
//syntax : data-type varname []; 
// this [] known as subscript operator

import java.util.Scanner;
public class example6 {
//     public static void main(String[] args) {
//         int a[] = {10,20,30,40,50}; //refrence variable
//         System.out.println(a[0]);
//     }

//this was an simple example for array declaration and initialization

   public static void main(String[] args) {
    int a[]=new int[5];
    Scanner sc = new Scanner(System.in);


    //the first for loop is for getting array elements from the user
    //second for loop is for printing the array

    //here I used scanner class for getting user inputs
    //sc.close statements close the scanner class for not getting error or some leakage
    

    for(int i=0;i<5;i++)
    {   
        
        System.out.print("Enter the value for array index " + i + ": ");
        a[i] = sc.nextInt();
    }
    
    for(int i=0;i<5;i++)
    {
        System.out.println("a[" + i + "] = " + a[i]);
    }

    sc.close();
   }

 }

