package examples.sorting;

import java.util.Random;

public class MergeSortExample {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        System.out.println("Before sorting:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("After sorting:");
        printArray(numbers);
    }

    private static void printArray(int[] inputArray) {
        for (int n : inputArray) {
            System.out.printf("%d \t", n);
        }
        System.out.println();
    }

    private static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        // Fill the left half array
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        // Fill the right half array
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }

    public static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0; // To iterate left array
        int j = 0; // To iterate right array
        int k = 0; // To iterate merged array

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] < rightArray[j]) {
                inputArray[k] = leftArray[i];
                i++;
            } else {
                inputArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // To add the remaining elements in both left arrays
        while (i < leftSize) {
            inputArray[k] = leftArray[i];
            i++;
            k++;
        }

        // To add the remaining elements in both left arrays
        while (j < rightSize) {
            inputArray[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
