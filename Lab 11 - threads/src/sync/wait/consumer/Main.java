package sync.wait.consumer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> taskList = new ArrayList<>();
        int maxSize = 5;

        Producer producer = new Producer(taskList, maxSize);
        Consumer consumer = new Consumer(taskList);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
