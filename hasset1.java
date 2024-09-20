import java.util.*; 
//Hashset no repeatition randomly print
//linked Hashset no rep print sequentially
//treeset no repetition print in ascending order. 
class hasset1{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set= new HashSet<String>();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("One");  
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
 }  
}  
