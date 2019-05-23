package sync.wait.consumer;

import java.util.List;

public class Consumer implements Runnable {
    private List<Integer> taskList;

    public Consumer(List<Integer> taskList) {
        this.taskList = taskList;
    }

    public void consume() throws InterruptedException {
        synchronized (taskList) {
            while (taskList.size() == 0) {
                System.out.println("List is empty: start producing elements");
                taskList.wait();
            }
            Thread.sleep(1000);
            Integer removedElement = taskList.remove(0);
            System.out.println("Deleted from list element " + removedElement);
            taskList.notifyAll();
        }
    }

    @Override
    public void run() {
        System.out.println("Consuming ...");
        while (true) {
            try {
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
