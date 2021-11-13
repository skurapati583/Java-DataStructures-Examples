package examples;

public class LinkedList {

    Node head;

    void insert(int value) {
        /***
         * Inserts node at end of linked list
         */
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        /***
         * If head is null, then linked list is empty and this new node is first
         * element.
         */
        if (head == null) {
            head = newNode;
        } else {
            Node tempNode = head;

            /***
             * Traverse from starting node till last node whose next value is null. Append
             * the item there, by pointing the last item next to new node.
             */
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }

    void insertAtHead(int value) {
        /***
         * Inserts at start location. Change the current head to new head.
         */
        Node node = new Node();
        node.data = value;
        node.next = head;
        head = node;
    }

    void insertAt(int value, int position) {
        /***
         * Inserts the item at given position when starting traversal from head,
         * counting the nodes passed by, if desired position is reached, update the node
         * references.
         */

        if (position == 0) {
            insertAtHead(value);

        } else {
            Node newNode = new Node();
            newNode.data = value;
            newNode.next = null;
            Node iterNode = head;
            for (int i = 0; i < position - 1; i++) {
                iterNode = iterNode.next;
            }
            newNode.next = iterNode.next;
            iterNode.next = newNode;
        }
    }

    void show() {
        /***
         * Show the items inside linked list
         */
        Node iteratorNode = head;

        do {
            System.out.printf("| %d => ", iteratorNode.data);
            iteratorNode = iteratorNode.next;
        } while (iteratorNode.next != null);
        System.out.printf("| %d => null |\n ", iteratorNode.data);
    }

    void deleteAt(int position) {
        if (position == 0) {
            head = head.next;
        } else {
            Node iterNode = head;
            for (int i = 0; i < position - 1; i++) {
                iterNode = iterNode.next;
            }
            iterNode.next = iterNode.next.next;
        }
    }
}
