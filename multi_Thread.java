class mult extends Thread {
    public void run(){
        for(int i=1; i<5;i++){
            if(i==2) yield();
            {
                System.out.println("fist thread"+i);
            }
        }
    }
}
class mult1 extends Thread {
    public void run(){
        for(int i=1; i<5;i++){
            // if(i==3) stop();
            {
                System.out.println("second thread"+i);
            }
        }
    }
}
class mult2 extends Thread {
    public void run(){
        for(int i=1; i<5;i++){
            if(i==2) {
                try{
                    sleep(1000);
                    System.out.println("all threads done");
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
            {
                System.out.println("third thread"+i);
            }
        }
    }
}

public class multi_Thread{
    public static void main(String[] args){
        mult o1= new mult();
        o1.start();
        System.out.println(o1.isAlive());
        mult1 o2= new mult1();
        o2.start();

        mult2 o3= new mult2();
        o3.start();
    }
}