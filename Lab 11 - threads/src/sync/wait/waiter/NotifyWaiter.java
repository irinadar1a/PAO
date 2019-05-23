package sync.wait.waiter;

public class NotifyWaiter {
    public static void main(String args[]){
        Message message = new Message("Waiting to be processed");
        Waiter waiterRunnable = new Waiter(message);
        Thread waiter = new Thread(waiterRunnable, "Waiter Thread");
        Notifier notifier = new Notifier(message);
        Thread notifierThread = new Thread(notifier);
        Thread waiterThread = new Thread(waiter);

        notifierThread.start();
        waiterThread.start();

    }
}
