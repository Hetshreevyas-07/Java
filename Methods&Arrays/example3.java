public class example3 {
    static int sum(int a, int b)
    {
     return a + b;
    }
     static int sum(int a, int b, int c){
         return a+b+c;
     }
     static int sum(int a,int b,int c,int d)
     {
       return a+b+c+d;
     }
     public static void main(String[] args) {
         System.out.println("sum for 2 integers is:"+ sum(7,8));
         System.out.println("sum for 3 integers :" + sum(7, 80, 9));
         System.out.println("sum for 4 integers is :" +sum(7, 9, 8,7));
    }
}

//this is method overloading example in which same methods but different parameters
//you can see the method name sum is same but the paramteres or arguments are different.
//for 1st it's 2 paramters 
//for 2nd it's 3 parameters and so on...
