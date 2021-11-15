package examples;

public class MultiThreadingUsingThreadClass extends Thread{

    private int threadNumber;

    public MultiThreadingUsingThreadClass(int threadNumber) {
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
