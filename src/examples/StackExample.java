package examples;

class StackExample {

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.printf("The size of stack currently is: %d%n", stack.size());
        System.out.printf("Is stack currently empty: %b %n", stack.isEmpty());

        stack.pop();

        stack.push(6);
        stack.push(19);
        stack.push(3);
        stack.push(8);
        System.out.println("Display all contents inside stack after adding 6, 19, 3, 8: ");
        stack.show();
        System.out.printf("The size of stack currently is: %d%n", stack.size());


        System.out.println("Pushing another element: 25");
        stack.push(25);
        System.out.println("Display the contents of stack:");
        stack.show();

        System.out.println("Pushing another element: 30");
        stack.push(30);
        System.out.println("Display the contents of stack:");
        stack.show();

        System.out.printf("The peek element is: %d %n", stack.peek());

        System.out.println("Perform Pop operation in stack: ");
        System.out.printf("Popped element: %d %n", stack.pop());
        System.out.println("Display all contents inside stack after pop operation");
        stack.show();
        System.out.printf("The size of stack currently is: %d%n", stack.size());

        System.out.printf("The peek element is: %d %n", stack.peek());

        System.out.printf("Is stack currently empty: %b %n", stack.isEmpty());

        System.out.println("Perform Pop operation in stack: ");
        System.out.printf("Popped element: %d %n", stack.pop());
        System.out.println("Display all contents inside stack after pop operation");
        stack.show();
        System.out.printf("The size of stack currently is: %d%n", stack.size());

        System.out.printf("The peek element is: %d %n", stack.peek());

        System.out.println("Perform Pop operation in stack: ");
        System.out.printf("Popped element: %d %n", stack.pop());
        System.out.println("Display all contents inside stack after pop operation");
        stack.show();
        System.out.printf("The size of stack currently is: %d%n", stack.size());

        System.out.println("Perform Pop operation in stack: ");
        System.out.printf("Popped element: %d %n", stack.pop());
        System.out.println("Display all contents inside stack after pop operation");
        stack.show();
        System.out.printf("The size of stack currently is: %d%n", stack.size());
        System.out.printf("Is stack currently empty: %b %n", stack.isEmpty());
    }
    
}
