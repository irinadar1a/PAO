package create;

public class RunnableThread implements Runnable{

    public static void main(String[] args){
        Thread thread = new Thread(new RunnableThread());
        thread.start();

        Thread thread2 = new Thread(new RunnableThread(), "Second Thread");
        thread2.start();

//        System.out.println(Runtime.getRuntime().availableProcessors());
    }

    @Override
    public void run() {
        System.out.println("starting a new thread with name " + Thread.currentThread().getName());
    }
}
