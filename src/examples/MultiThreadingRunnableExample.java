package examples;

public class MultiThreadingRunnableExample {

    public static void main(String[] args) throws InterruptedException {
        for (int i=1; i<=5; i++) {
            MultiThreadingUsingRunnableInterface myThing = new MultiThreadingUsingRunnableInterface(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
            //if(i==3) {
              //  throw new RuntimeException();
            //}
        }
    }

}
