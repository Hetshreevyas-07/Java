package chapter5;

import java.util.ArrayList;

public class ch61 {
 //arraylist   
 //array means contiguous chunk 
 //data stored in continuous memory location and it's in fixed size
 
 //arraylist's size can be changed
 //if i create 0 then i'll joined it to 1 then i'll joined it 2
 //in arrays we can store primitive data types
 //in arraylist we can store objects only in two ways ...stack and heap
 //it's stored in heap
   
 public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<String> list2 =  new ArrayList<>();
    System.out.println(list);
    list.add(7);
    list.add(8);
    System.out.println(list);

 }

}
//  Basic Features
// Part of Java Collections Framework.

// Stores elements in insertion order.

// Allows duplicate elements.

// Can store objects only (not primitive types directly like int, but you can use wrapper classes like Integer).

// Provides methods to add, remove, access, or search elements.
// Method                   | Description
// add(element)             | Adds element to the list
// get(index)               | Gets element at specific index
// set(index, element)      | Updates element at index
// remove(index)            | Removes element at index
// size()                   | Returns number of elements
// clear()                  | Removes all elements
// contains(element)        | Checks if element exists

