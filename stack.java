
import java.util.Iterator;
import java.util.*;

public class stack {
    public static void main(String[] args) {
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
}
