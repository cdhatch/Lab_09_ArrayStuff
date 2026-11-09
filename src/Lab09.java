import java.util.Scanner;
import java.util.Random;

public class Lab09 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // Task 1: Create an array
        int[] dataPoints = new int[100];

        // Task 2: Fill array with random numbers
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3: Display array values
        System.out.println("Random numbers:");

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);

            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }

        System.out.println();

        // Task 4: Calculate sum and average
        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);

        // Task 5: Ask user for a number
        int searchValue = SafeInput.getRangedInt(in, "Enter a number to search for", 1, 100);

        // Task 6: Count how many times the number appears
        int count = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                count++;
            }
        }

        System.out.println("The number " + searchValue + " was found " + count + " times.");

        // Task 7: Find first position of another number
        int searchAgain = SafeInput.getRangedInt(in, "Enter another number to search for", 1, 100);

        boolean found = false;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchAgain) {
                System.out.println("The value " + searchAgain + " was found at array index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The value " + searchAgain + " was not found in the array.");
        }

        // Task 8: Find minimum and maximum
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {

            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }

            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);

        // Task 9: Call getAverage method
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Task 9: Calculate average
    public static double getAverage(int values[]) {

        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return (double) sum / values.length;
    }
}


