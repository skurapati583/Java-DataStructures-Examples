package examples;

class LinkedListExample {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(2);
        linkedList.insert(32);
        linkedList.insert(45);
        linkedList.insert(13);

        linkedList.show();

        linkedList.insertAtHead(94);
        System.out.println("After updating the head to 94: ");
        linkedList.show();

        linkedList.insertAtHead(83);
        System.out.println("After updating the head to 83 again: ");
        linkedList.show();

        linkedList.insertAt(55, 3);
        System.out.println("After inserting 55 in between: ");
        linkedList.show();

        linkedList.insertAt(15, 0);
        System.out.println("After inserting 15 at starting: ");
        linkedList.show();

        linkedList.deleteAt(4);
        System.out.println("Deleting at 4 position: ");
        linkedList.show();

        linkedList.deleteAt(0);
        System.out.println("Deleting at 0 - head position: ");
        linkedList.show();

        linkedList.deleteAt(5);
        System.out.println("Deleting at 5 - last position: ");
        linkedList.show();
    }
}
