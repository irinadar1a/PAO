package sync.wait.waiter;

public class Waiter implements Runnable {
    private Message message;

    public Waiter(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("Current status " + message.getMessage());
        System.out.println(name + " waiting to get notified at time: " + System.currentTimeMillis());
        synchronized (message) {
            try {
                message.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("New message " + message.getMessage() + "received at " + System.currentTimeMillis());

    }
}
