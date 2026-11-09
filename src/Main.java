import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        // Task 1: Create an array with 100 integers
        int[] dataPoints = new int[100];

        // Task 2: Fill the array with random numbers
        Random rnd = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3: Display all the numbers
        System.out.println("Here are the 100 random numbers:");

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);

            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }

        System.out.println();

        // Task 4: Calculate the sum and average
        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            sum = sum + dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println();
        System.out.println("The sum of the random numbers is: " + sum);
        System.out.println("The average of the random numbers is: " + average);

        // Task 5: Ask the user for a number
        int searchValue = SafeInput.getRangedInt(
                console, "Enter a number to search for", 1, 100);

        // Task 6: Count how many times the number appears
        int count = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                count++;
            }
        }

        System.out.println("The number " + searchValue +
                " was found " + count + " times in the array.");

        // Task 7: Find the first position of a number
        int findValue = SafeInput.getRangedInt(
                console, "Enter another number to find", 1, 100);

        int position = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == findValue) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("The value " + findValue +
                    " was found at array index " + position);
        } else {
            System.out.println("The value " + findValue +
                    " was not found in the array.");
        }

        // Task 8: Find the smallest and largest numbers
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

        // Task 9: Test the getAverage method
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

        console.close();
    }

    // Task 9: Method to calculate the average of an array
    public static double getAverage(int values[]) {
        int total = 0;

        for (int i = 0; i < values.length; i++) {
            total = total + values[i];
        }

        double avg = (double) total / values.length;
        return avg;
    }
}
