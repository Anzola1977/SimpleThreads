public class Main {

    public static void main(String[] args) {
        SimpleThreads threads = new SimpleThreads();
        RunnableThreads runnableThreads = new RunnableThreads();
        Thread thread = new Thread(runnableThreads);
        threads.start();
        thread.start();
    }
}
