package chapter4;

//access modifiers
//public : all packages
//private : same class
//default : same packages

public class ch46 {
 public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "shree";
    s1.percentage = 85.7; 
    System.out.println(s1);
 }
}

class Student {
   String name;
   private int number;
   double percentage;

   public void setage(int number) {
      this.number = number;
   }
}