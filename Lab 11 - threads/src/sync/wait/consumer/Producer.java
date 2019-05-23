package sync.wait.consumer;

import java.util.List;

public class Producer implements Runnable {
    private List<Integer> taskList;
    private int maxSize;

    public Producer(List<Integer> taskList, int maxSize) {
        this.taskList = taskList;
        this.maxSize = maxSize;
    }

    public void produce(int i) throws InterruptedException {
        synchronized (taskList) {
            while(taskList.size() == maxSize){
                System.out.println("The list is full: start consuming elements");
                taskList.wait();
            }
            Thread.sleep(1000);
            taskList.add(i);
            System.out.println("Added to list element " + i);
            taskList.notifyAll();
        }
    }

    @Override
    public void run() {
        System.out.println("Producing...");
        int element = 0;
        while (true){
            try {
                produce(element++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
