//two dimentional array
//if we want output like this :
// [123
//  456]

//it declares with int[][] numbers;
//[rows][columns]

import java.util.Scanner;  

public class example10 {  
    public static void main(String[] args) {  
        int a[][] = new int[2][3]; // declare a 2D array with 2 rows and 3 columns  
        Scanner sc = new Scanner(System.in);  
        
        // Input elements into the array  
        for (int i = 0; i < a.length; i++) { // iterate through rows  
            for (int j = 0; j < a[i].length; j++) { // iterate through columns  
                System.out.print("Enter array element at [" + i + "][" + j + "]: ");  
                a[i][j] = sc.nextInt();  
            }  
        }  
        sc.close();  

        System.out.println("Array output:");  
        
        // Output elements of the array  
        for (int i = 0; i < a.length; i++) { // iterate through rows  
            for (int j = 0; j < a[i].length; j++) { // iterate through columns  
                System.out.print(a[i][j] + " "); // print elements in same line  
            }  
            System.out.println(); // move to the next line after each row  
        }  
    }  
}  