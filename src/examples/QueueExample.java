package examples;

class QueueExample {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(5);
        queue.enQueue(34);
        queue.enQueue(54);
        queue.enQueue(97);
        queue.enQueue(87);

        queue.show();
        System.out.println("Removing elements");

        System.out.printf("The removed value is: %d%n", queue.deQueue());
        System.out.printf("The removed value is: %d%n", queue.deQueue());
        System.out.printf("The removed value is: %d%n", queue.deQueue());

        queue.show();

        queue.enQueue(51);
        queue.enQueue(340);
        queue.enQueue(70);

        queue.show();

        System.out.printf("The removed value is: %d%n", queue.deQueue());
        System.out.printf("The removed value is: %d%n", queue.deQueue());
        queue.show();

        queue.enQueue(23);
        queue.enQueue(60);
        queue.enQueue(231);
        queue.enQueue(600);

    }
}
