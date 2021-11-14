package examples.sorting;

import java.util.Random;

public class BubbleSortExample {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[13];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before sorting:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("After sorting:");
        printArray(numbers);
    }

    private static void printArray(int[] inputArray) {
        for (int n : inputArray) {
            System.out.printf("%d \t", n);
        }
        System.out.println();
    }

    private static void bubbleSort(int[] inputArray) {

        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    // Swapping both left and right items with use of temp variable
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                    swappedSomething = true;
                }
            }
        }

    }
}
