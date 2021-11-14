package examples.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedList {

    public static void main(String[] args) {

        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("John");
        namesLinkedList.add("Kohli");
        namesLinkedList.add("Dhoni");
        namesLinkedList.add("Rohit");

        System.out.println(namesLinkedList.get(2));

        namesLinkedList.add(1, "Bumrah");


        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Kohli");
        namesArrayList.add("Dhoni");
        namesArrayList.add("Rohit");

        System.out.println(namesArrayList.get(2));

        namesArrayList.add(1, "Bumrah");
    }
}
