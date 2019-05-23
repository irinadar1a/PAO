package sync.wait.waiter;

public class Notifier implements Runnable {
    private Message message;

    public Notifier(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started running");

        synchronized (message) {
            try {
                Thread.sleep(1000);
                message.setMessage(name + " Notifier work done");
                message.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
