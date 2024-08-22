//Aadhav Sivakumar
import java.util.Random;

public class SmallestLargest {

    public static void main(String[] args) {
        // Create an array that will hold 10 integers
        int[] numbers = new int[10];

        // Fill the array with random integers from 1 to 100
        fillArrayWithRandomNumbers(numbers);

        // Print out the array
        System.out.print("Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Print out the smallest and largest value
        System.out.println("Smallest Value: " + smallestValue(numbers));
        System.out.println("Largest Value: " + largestValue(numbers));
    }

    // Method to fill the array with random integers from 1 to 100
    public static void fillArrayWithRandomNumbers(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100) + 1;
        }
    }

    // Method to return the smallest value in the array
    public static int smallestValue(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    // Method to return the largest value in the array
    public static int largestValue(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
}
