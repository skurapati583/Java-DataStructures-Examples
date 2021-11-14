package examples;

class Queue {
    int queueArray[] = new int[5];
    int front = 0;
    int rear = -1;
    int size = 0;

    void enQueue(int data) {
        /***
         * Insert data into queue from rear end. Check if queue is full. If full exit.
         * Else increment rear, put data into rear index location
         */

        if (!isFull()) {
            queueArray[++rear % 5] = data;
            size++;
            System.out.printf("Enqueued element: %d %n", data);
        } else {
            System.out.println("Queue is full..... Unable to enQueue..");
        }

    }

    void show() {
        System.out.println("Queue elements are: ");

        for (int i = 0; i < size; i++) {
            System.out.printf("%d\t", queueArray[(front + i) % 5]);
        }

        // for (int n : queueArray) {
        // System.out.printf("%d \t", n);
        // }
        System.out.println();
    }

    int deQueue() {
        int data = 0;
        if (!isEmpty()) {
            data = queueArray[front];
            queueArray[front++ % 5] = 0;
            size -= 1;
        } else {
            System.out.println("Queue is empty... unable to deQueue.");
        }
        return data;
    }

    int peek() {
        return queueArray[front];
    }

    boolean isFull() {
        return size == 5;
    }

    boolean isEmpty() {
        return size == 0;
    }
}
