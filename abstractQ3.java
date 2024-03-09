//3. Write a Java program to create an abstract class Animal with an abstract method called sound (). Create subclasses Lion and Tiger that extend the Animal class and implement the sound) method to make a specific sound for each animal.


abstract class animal{
    abstract void sound();
}

class lion extends animal{
    void sound(){
        System.out.println("lions sound");
    }
}
class tiger extends animal{
    //we need to use sound method as it is an abstract method of the parent class
    //other than that we ca use as many function as req
    void sound(){
        System.out.println("tigers sound");
    }
}
public class abstractQ3 {
    public static void main(String[] args){
        tiger O1= new tiger();
        O1.sound();
    }
}
