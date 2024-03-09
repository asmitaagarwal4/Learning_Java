class test4{
    void sum(int a , int b){
        System.out.println(a+b);
    }
    void sum(int a , double b){
        System.out.println(a+b);
    }
     void sum(float a , float b){
        System.out.println(a+b);
    }
    //write public here to access through the object.
    void sum(int a , int b, int c){
        System.out.println(a+b+c);
    }
}
public class method_overloading {
    public static void main(String[] args){
        test4 o1= new test4();
        double b=2.3;
        o1.sum(1,2);
        o1.sum(1,b);
        o1.sum(1,2,3);
    }
}
