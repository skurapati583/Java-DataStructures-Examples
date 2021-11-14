package examples;

class Stack {

    private int stackArray[] = new int[5];
    int top = -1; // Default - stack is empty now.

    void push(int value) {
        /***
         * As a new value is received, add that element into stop, top is pointed to
         * latest element index.
         */
        if (size() == 5) {
            System.out.printf("Stack is full.... Unable to add %d element %n", value);
            return;
        }
        stackArray[++top] = value;
    }

    int pop() {
        /***
         * Remove the last element (top element) from stack - Last in First out. Update
         * the top reference to next element.
         */
        int data = 0;
        if (size() == 0) {
            System.out.println("Stack is empty..... Hence unable to pop element.");
        } else {
            data = stackArray[top];
            stackArray[top--] = 0;
        }

        return data;
    }

    int peek() {
        return stackArray[top];
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void show() {
        /***
         * Print the entire stack -
         */

        for (int element : stackArray) {
            System.out.printf("%d\t", element);
        }
        System.out.println();
    }

}
