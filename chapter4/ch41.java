package chapter4;

//class is like blueprint and template
//it defines properties and behaviors


//object is real thing that created from the class 
//or real world entity created from the class
public class ch41 {
    
    public static void main(String[] args) {
        System.out.println("hello friends!");
        person p = new person();
        //the above person p means we created an object for person class

        p.age = 25;
        p.name = "shree";
        System.out.println("age is:"+p.age + " "+"name is : " +p.name);
        p.walk();//method is called
     }

}

class person {
    String name;
    int age;

    //person is blueprint
    //every person has name and age these are entities or properties

    void walk()
    {
        //here we created method ...void  walk ..with no return type
        System.out.println(name + " is walking ");
    }
}
