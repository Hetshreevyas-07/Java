//sorting array
//ascending and decending order

//bubble sort

//let's understand it we have an array 7,8,3,1,2
//the highest weighted element is gonna placed to last place
//the second last heighest element is gonna placed to second last place
//we will compare all elements
//we will compare 7 with eight...eight gonna be compare with 3 ...3 gonna be compare with 1 and 1 gonna be compare with 2
//which is higher in number then it will be placed to one step back

//7,8,3,1,2
//compare 7 with 8
//check which element is higher and which is lower
//7,8
//now compare 8 with 3
//check for condition 
//7,3,8
//now again compare 8 with 1
//check for condition
//7,3,1,8
//now again compare 8 with 2
//check for condition
//7,3,1,2,8
//hence highest element is placed at last
//now check for another
//now again check for 7 with the same process
//compare 7 with 3
//is 7 is greater than 3?
//if not then place it right side or move towards 8th element
//replace the position
//3,7,1,2,8
//now compare 7 with 1
//again replace it
//3,1,7,2,8
//now compare 7 with 2
//3,1,2,7,8
//now again check 
//3,1,2,7,8
//now take 3 as a element
//compare with 1
//1,3,2,7,8
//again compare with 2
//1,2,3,7,8
//array sorted



public class example9{
    public static void main(String[] args) {
        // Define an array to be sorted
        int arr[] = {7, 8, 3, 1, 2};  
        int n = arr.length;  // Get the length of the array

        // Bubble Sort Algorithm (Ascending Order)
        for (int i = 0; i < n - 1; i++) {  // Outer loop runs n-1 times
            for (int j = 0; j < n - i - 1; j++) {  // Inner loop runs (n-i-1) times
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {  
                    // Swap arr[j] and arr[j+1] if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");  // Print each element
        }
    }
}

// 1. Initial Setup
// An integer array {7, 8, 3, 1, 2} is declared.

// The length of the array is stored in n.

// 2. Outer Loop (for i = 0 to n-1)
// This loop controls the number of passes (n-1 times).

// Each pass ensures the next highest element is placed at the correct position.

// 3. Inner Loop (for j = 0 to n-i-1)
// The adjacent elements are compared (arr[j] > arr[j+1]).

// If arr[j] is greater than arr[j+1], they swap positions to move the larger number toward the right.

// If you want descending order, change this condition:
// if (arr[j] > arr[j + 1])  to if (arr[j] < arr[j + 1])  



