import java.util.ArrayList;
import java.util.Iterator;
// import java.util.List;

public class arraylist {
    public static void main(String[] args) {
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
}
