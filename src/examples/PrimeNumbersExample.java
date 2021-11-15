package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersExample {
    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt(); // User input of limit

        for (int numberToCheck = 2; numberToCheck<=limit; numberToCheck++) {
            if(isPrime(numberToCheck)) {
                primeNumbers.add(numberToCheck);
            }
        }
        System.out.println("The list of prime numbers are: " + primeNumbers);
    }

    private static boolean isPrime(int numberToCheck) {
        for(int factor=2; factor <= numberToCheck/2;factor++) {
            if (numberToCheck%factor == 0) {
                return false;
            }
        }
        return true;
    }
}
