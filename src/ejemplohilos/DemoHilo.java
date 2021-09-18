package ejemplohilos;

public class DemoHilo{

    public static void main(String args[]) {
        new NewThread();
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Hilo principal: " + 1);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Interrupción del hilo principal");
        }
    }
}

class NewThread implements Runnable {
    Thread t;
    NewThread() {
        t = new Thread(this, "Hilo demo");
        System.out.println("Hilo hijo " + t);
        t.start();
    }
    public void run() {
        try {
            for (int i = 5; i > 0; i --) {
                System.out.println("Hilo hijo: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupción del hilo hijo.");
        }
        System.out.println("Salida del hilo hijo.");
    }

}
