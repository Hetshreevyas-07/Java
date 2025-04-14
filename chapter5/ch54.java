package chapter5;

import javax.lang.model.util.Elements.Origin;

//string class 

public class ch54 {
    public static void main(String[] args) {
        String s = "Shree";
        //string is actually a class because it starts from capital letter
        //i mean String's s is capital
        String src = new String("Shree");
        //you can create string class also
        System.out.println(src);
        System.out.println(src.hashCode());
        System.out.println(src.charAt(0));
        //hence you can see it's work as class
    }
}
