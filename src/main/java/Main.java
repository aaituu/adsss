import java.util.Scanner;

public class Main {
    // This function takes an array of integers and returns the minimum value.
    // It starts by assuming the first element is the minimum.
    // Then it loops through all elements, comparing each one to the current minimum.
    // If a smaller value is found, it updates the minimum.
    // This is a basic linear search for the smallest number in the array.
    // It uses a simple for-each loop and no recursion.
    // Time Complexity: O(n)
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Task 1: Find Minimum ---");
        int len = in.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) arr[i] = in.nextInt();
        System.out.println("Min: " + findMin(arr));
    }
}
