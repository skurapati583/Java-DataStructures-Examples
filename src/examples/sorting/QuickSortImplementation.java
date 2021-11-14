package examples.sorting;

import java.net.Socket;
import java.util.Random;

public class QuickSortImplementation {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        Random random = new Random();
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }

        System.out.println("Before sorting:");
        printArray(numbers);

        quickSort(numbers, 0, numbers.length -1);

        System.out.println("After sorting:");
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {

        for (int n: numbers) {
            System.out.printf("%d ", n);
        }
        System.out.println();
        System.out.flush();
    }

    public static void quickSort(int[] inputArray, int start, int end) {
        if (start < end) {
            int pivot = partition(inputArray, start, end);
            System.out.printf("The pivot found is: %d %n", inputArray[pivot]);
            quickSort(inputArray, start, pivot - 1);

            System.out.println("The sorted till now is: ");
            printArray(inputArray);

            quickSort(inputArray, pivot + 1, end);

            System.out.println("The sorted till now is: ");
            printArray(inputArray);
        }
    }

    private static int partition(int[] inputArray, int start, int end) {
        int pivot = start, i;
        for (i = start+1; i<=end; i++) {
            if(inputArray[i] < inputArray[start]) {
                swap(inputArray, ++pivot, i);
            }
        }
        swap(inputArray, start, pivot);
        return pivot;
    }

    private static void swap(int[] inputArray, int start, int pivot){
        int tmp = inputArray[start];
        inputArray[start] = inputArray[pivot];
        inputArray[pivot] = tmp;
    }
}
