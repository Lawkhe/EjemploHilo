package ejemplohilos;

public class DemoHilo2{

    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Hilo actual: " + t);
    // Cambio del nombre del hilo

        t.setName("Mi hilo");
        System.out.println("Después del cambio de nombre: " + t);
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Interrupción del hilo principal");
        }
    }
}
