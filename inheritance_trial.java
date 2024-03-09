

class java2006{
    void print(){
        System.out.println("java2006");
    }    
}

class bcy extends java2006{
    void print1(){
        System.out.println("bcy");
    }
}

class bsa extends java2006{
    void print2(){
        System.out.println("BSA");
    }
}


public class inheritance_trial {
   public static void main(String args[]) {
    bsa obj= new bsa();
    obj.print();
    obj.print2();
   }
}
