//what is exception in java

// java exception is an unexpected unexpected event that occurs during program execution.

// It affects the flow of the program instructions which can cause the program terminate abnormally

// some reasons are :

// invalid user input
// device failure
// loss of network connection
// code errors
// opening unavailable file
// out of disk memory

// Checked Exceptions

// Checked at compile time.
// Must be handled using try-catch or declared using throws.
// ✅ Example: IOException, SQLException.
//An IOException is also known as a checked exception. They are checked by the compiler at the compile time and programmer is prompted to handle these exception
  // trying to open a file that doesn't exist
//trying to read past the end of a file

// Unchecked Exceptions
// Occur at runtime.
// No need to declare or catch them.
// ✅ Example: NullPointerException, ArithmeticException.
//A runtime exception happens due to programming error. they are also known as unchecked exception
// null pointer access means missing the initialization of a variable 
//out of bound array access 
//dividing by 0


// Errors
// Not exceptions, but serious issues.
// Caused by system failures, memory errors, etc.
// ✅ Example: OutOfMemoryError, StackOverflowError.

// Object  
// └── Throwable  
//     ├── Exception  
//     │   ├── IOException  
//     │   └── RuntimeException  
//     │       ├── ArithmeticException  
//     │       ├── NullPointerException  
//     │       └── ArrayIndexOutOfBoundsException  
//     └── Error


// Class named 611 to demonstrate various types of exceptions
public class 611 {

    public static void main(String[] args) {
        // 1. ArithmeticException: divide by zero
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero.");
        }

        // 2. NullPointerException: using null object reference
        try {
            String str = null;
            System.out.println(str.length());  // accessing method on null
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot use methods on a null object.");
        }

        // 3. ArrayIndexOutOfBoundsException: accessing invalid index
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // index 5 doesn't exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index does not exist in array.");
        }

        // 4. IOException: example using File (Checked Exception)
        try {
            java.io.FileReader file = new java.io.FileReader("nonexistentfile.txt");
        } catch (java.io.IOException e) {
            System.out.println("Caught IOException: File not found or error reading file.");
        }

        // 5. Error: Simulating StackOverflowError (not caught normally)
        try {
            causeStackOverflow();
        } catch (StackOverflowError e) {
            System.out.println("Caught Error: StackOverflowError occurred.");
        }

        System.out.println("Program completed.");
    }

    // Recursive function to cause StackOverflowError
    public static void causeStackOverflow() {
        causeStackOverflow();
    }
}






