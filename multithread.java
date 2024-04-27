class vit extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("updating...");
        }
    }
}

class vit2 extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            // try {
            //     sleep(100);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
            System.out.println("vit 2 updating....");
        }
    }
}

public class multithread {
    public static void main(String[] args) {

        vit o1 = new vit();
        o1.start();
        vit2 o2 = new vit2();
        o2.start();
    }
}
