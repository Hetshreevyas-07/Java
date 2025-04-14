package chapter5;

//encapsulation
//no one can use it from outside
//it's a mechanism through which we can wrapping the data members and member methods of class in single unit
// declare the class variable as a private
//declare the class methods as a public

//encapsulation means bundling of fields and methods inside a single class. It prevents outer classes from accessing and changing fields and methods of a class.this also helps to achieve data hiding.

//data hiding is a way of restricting the access of our data members by hiding the implementation details.


public class ch52 {
    public static void main(String[] args) {
       Student s1 = new Student();
       s1.setage(15);
       System.out.println(s1.getaage());
    }
}

class Student {
    String name;
    private int number;
    double percentage;
 
    public void setage(int number) {
       this.number = number;
    }

    public int getaage() {
        return number;
    }
 }
