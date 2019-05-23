package create;

public class ThreadThread extends Thread {
    public static void main(String[] args){
        Thread thread = new ThreadThread();
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("starting new thread");
        System.out.println("thread name " + this.getName());
    }
}
