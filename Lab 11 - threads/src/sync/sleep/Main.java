package sync.sleep;

public class Main {
    public static void main(String[] args) throws Exception {
        Runnable r = new MySleepingThread();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

    }
}
