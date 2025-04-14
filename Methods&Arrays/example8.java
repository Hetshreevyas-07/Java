//passing array to methods


public class example8 {
 
    public static void main(String[] args) {
    
        System.out.println("enter elements:");
        int marks[]= {10, 20, 30, 40, 50};
        display(marks);
    }

     static void display(int[] numbers)
    {
        System.out.println("Array elements are:");
        for (int num : numbers) {  // Enhanced for loop to iterate through array
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

//here we're calling an array just by method passing array elements just from a method
//we have declared user defined method then use for loop for This loop goes through each number in the array and prints it.

//int num : numbers → This means "for each number (num) in the array (numbers), print it."
//then we use display(marks) in public static void main for Here, we send the whole array to the printArray method.

// The method receives it as int[] numbers and prints all the values.

