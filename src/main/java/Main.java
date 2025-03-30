import java.util.Scanner;

public class Main {
    // This function calculates the average of elements in an integer array.
    // It sums all the elements using a loop and divides the result by the array length.
    // The result is returned as a double to keep decimal precision.
    // This function works with arrays of any size.
    // It does not use recursion — only iteration.
    // Make sure to avoid empty arrays to prevent division by zero.
    // Time Complexity: O(n)
    public static double findAverage(int[] arr, int len) {
        int sum = 0;
        for (int num : arr) sum += num;
        return (double) sum / len;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Task 2: Find Average ---");
        int len = in.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) arr[i] = in.nextInt();
        System.out.println("Average: " + findAverage(arr, len));
    }
}
