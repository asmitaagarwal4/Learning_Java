package access_modifiers;

//to run package 
//PS W:\codes\java> javac access_modifiers/class1.java 
//PS W:\codes\java> java  access_modifiers/class1 

class Md{
    public String name1="public";
    private String name2="private";
    protected String name3="protected";
    String name4="default";
    void display(){
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }
}
public class class1 {
    public static void main(String args[]){
    // System.out.println("hello");
    Md obj= new Md();
    obj.display();
    }
    
}
