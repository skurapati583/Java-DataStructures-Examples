package examples;

/***
 * Stack implementation using dynamic array
 */

class DStack {
    int capacity = 2;
    private int stackArray[] = new int[capacity];
    int top = -1; // Default - stack is empty now.

    void push(int value) {
        /***
         * As a new value is received, add that element into stop, top is pointed to
         * latest element index. If the stack is full, increase the capacity.
         */
        if (size() == capacity) {
            expand();
        }
        stackArray[++top] = value;
    }

    private void expand() {
        /***
         * Create a new stack with double capacity that previous stack. Copy the
         * previous stack elements to latest one. Update the capacity value.
         */
        int length = size();
        int[] newStack = new int[capacity * 2];
        System.arraycopy(stackArray, 0, newStack, 0, length);
        stackArray = newStack;
        capacity *= 2;
    }

    int pop() {
        /***
         * Remove the last element (top element) from stack - Last in First out. Update
         * the top reference to next element. Shrink the stack capacity if elements are
         * popped out.
         */
        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is empty..... Hence unable to pop element.");
        } else {
            data = stackArray[top];
            stackArray[top--] = 0;
            shrink();
        }

        return data;
    }

    /***
     * Create new stack with decreased capacity as the elements popped from stack.
     * New capacity of stack becomes halved. Old Stack values copied into new stack.
     * This shrink will not happen on every pop.
     */
    void shrink() {
        int length = size();
        if (length <= capacity / 2) {
            int[] newStack = new int[capacity / 2];
            System.arraycopy(stackArray, 0, newStack, 0, length);
            stackArray = newStack;
            capacity /= 2;
        }
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
