//passing arguments by values
//here we're using just a method which don't need to load data for every paramters
//let's understand with example

// public class Innerexample2 {
//    static int sum(int a, int b)
//    {
//     return a + b;
//    }
//     static int sum(int a, int b, int c){
//         return a+b+c;
//     }
//     static int sum(int a,int b,int c,int d)
//     {
//       return a+b+c+d;
//     }
//     public static void main(String[] args) {
//         System.out.println("sum for 2 integers is:"+ sum(7,8));
//         System.out.println("sum for 3 integers :" + sum(7, 80, 9));
//         System.out.println("sum for 4 integers is :" +sum(7, 9, 8,7));
//     }
// }

//in above example you can see that if i want to sum for 2 , 3 ,4 integers i have to call every method and i must create every method for this solution we're using passing arguments by value 


public class example2 {
  static int sum(int...arr)
  {
    //this ... in int..arr is converts every arguments in array
    int result=0;
    for(int a:arr) //read as for a in arr
    {
      result +=a;
    }
    return result;
 }
 public static void main(String[] args) {
          System.out.println("the sum for 2 integers is:"+ sum(8,10));
          System.out.println("the sum for 3 integers is:"+ sum(8,10,7));
          System.out.println("the sum for 4 integers is:"+ sum(8,10,11,7));
       //this continues until you want sum for many numbers
     }    
}
