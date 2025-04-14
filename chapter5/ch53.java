package chapter5;

//wrapper class 
//it's used to convert primitive data types into objects

//eight classes of java.lang package are known as wrapper class 
//boolean,char,byte,short,int,long,float,double

//it has two methods 
//autoboxing and unboxing
//autoboxing means converting primitive to object.
//unboxing means object to primitive

public class ch53 {
    public static void main(String[] args) {
        int i =100;
        Integer a = Integer.valueOf(i);
        System.out.println(a);
       //this is the autoboxing example
       String str = "13";
       int s = Integer.parseInt(str);
       System.out.println(s);
    }
}
