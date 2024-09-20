package lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.Stack;

// Implement the list creation using ArrayList Class, Vector and stack with
// example and output.

public class Q12 {
     public static void Stack() {
        Stack<String> list=new Stack<String>();  
        //Adding elements in the List  
        list.push("Mango");  
        list.push("Apple");  
        list.push("Banana");  
        list.push("Grapes");
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());   
        } 
    }
    public static void ArrayList() {
        ArrayList<String> list=new ArrayList<String>();  
        //Adding elements in the List  
        list.add("Mango");  
        list.add("Apple");  
        list.add("Banana");  
        list.add("Grapes");
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());   
        } 
    }
    public static void Vector() {
        Vector<String> list=new Vector<String>();  
        //Adding elements in the List  
        list.add("Mango");  
        list.add("Apple");  
        list.add("Banana");  
        list.add("Grapes");
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());   
        } 
    }
    public static void main(String[] args) {
        Stack();
        ArrayList();
        Vector();
    }
}
