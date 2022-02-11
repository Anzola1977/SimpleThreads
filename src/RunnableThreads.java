public class RunnableThreads implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hallo! I'm thread two");
        }
    }
}
