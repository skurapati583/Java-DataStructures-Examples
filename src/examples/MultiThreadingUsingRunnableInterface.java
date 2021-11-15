package examples;

public class MultiThreadingUsingRunnableInterface implements Runnable{
    private int threadNumber;

    public MultiThreadingUsingRunnableInterface(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d: from thread number %d %n", i, threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Interrupted exception.");
            }
        }
    }
}
