package sync.sleep;

public class MySleepingThread implements Runnable {
    @Override
    public void run() {
        task();
    }

    public void task() {
        synchronized (this) {
            for(int i = 0; i < 10; i++) {
                try {
                    System.out.println("Index: " + i);
                    System.out.println("Current time " + System.currentTimeMillis());
                    Thread.sleep(1000);
//                    System.out.println("Current time " + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
