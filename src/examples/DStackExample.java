package examples;

class DStackExample {
    public static void main(String[] args) {
        DStack dStack = new DStack();
        System.out.printf("The current size of stack is: %d%n", dStack.size());
        System.out.printf("The current capacity of stack is: %d%n", dStack.capacity);
        System.out.println("Push elements 5, 15, 71, 45, 19: \n");
        dStack.push(5);
        dStack.push(15);
        dStack.push(71);
        dStack.push(45);
        dStack.push(19);
        dStack.push(39);
        dStack.push(140);
        dStack.push(21);
        dStack.push(34);
        dStack.push(54);
        dStack.push(77);

        dStack.show();
        System.out.printf("The current size of stack is: %d%n", dStack.size());
        System.out.printf("The current capacity of stack is: %d%n", dStack.capacity);
        System.out.printf("Pop stack element: %d%n", dStack.pop());
        System.out.printf("Pop stack element: %d%n", dStack.pop());
        System.out.printf("Pop stack element: %d%n", dStack.pop());
        System.out.printf("The current size of stack is: %d%n", dStack.size());
        System.out.printf("The current capacity of stack is: %d%n", dStack.capacity);

    }
}
