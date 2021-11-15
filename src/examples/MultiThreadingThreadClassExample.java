package examples;

public class MultiThreadingThreadClassExample {

    public static void main(String[] args) throws InterruptedException {
        for (int i=1; i<=5; i++) {
            MultiThreadingUsingThreadClass myThread = new MultiThreadingUsingThreadClass(i);
            myThread.start();

            //if(i==3) {
              //  throw new RuntimeException();
            //}
        }
    }

}
