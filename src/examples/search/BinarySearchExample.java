package examples.search;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = new int[8];

        numbers[0] = 5;
        numbers[1] = 13;
        numbers[2] = 34;
        numbers[3] = 35;
        numbers[4] = 53;
        numbers[5] = 64;
        numbers[6] = 66;
        numbers[7] = 69;


        System.out.println("Elements are:");
        printArray(numbers);

        System.out.println("Searching for 64: ");
        int result = binarySearch(numbers, 64);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found.");
        }
    }

    private static void printArray(int[] numbers) {
        for (int n : numbers) {
            System.out.printf("%d \t", n);
        }
        System.out.println();
    }

    public static int binarySearch(int[] inputArray, int target) {
        int left = 0;
        int right = inputArray.length - 1;

        while (left <= right) {
            int middle = (left + right)/2;
            if(target < inputArray[middle]) {
                right = middle - 1;
            } else if(target > inputArray[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
