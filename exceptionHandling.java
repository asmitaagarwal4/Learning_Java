class vote3{
    void validate(int age){
        if(age<18){
            throw new ArithmeticException("not eligible");
        }
        System.out.println("person can vote");
    }
}


// throw 
//throws working ??
public class exceptionHandling {
    public static void main(String args[]) throws Exception {
        vote3 o1=new vote3();
        o1.validate(17);
    }

    // public static void main(String args[]) {
    //     int a = 10, b = 0;
    //     try {

    //         // as try block encounters one exception it goes directly to catch block.
    //         // so only one exception is handled and the other is ignored as it is never
    //         // executed
    //         int c = a / b;
    //         System.out.println(c);
    //         int x[] = null;
    //         System.out.println(x[5]);

    //     } catch (NullPointerException e) {
    //         System.out.println(e);
    //         // only prints one exception
    //         // } catch (Exception e) {
    //         // System.out.println(e);
    //         // //only prints one exception
    //         // }

    //         // how to catch multiple exceptions ????
    //     }
    // }
}


