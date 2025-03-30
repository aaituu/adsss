import java.util.Scanner;

public class Main {
    // This function prints the elements of an array in reverse order using recursion.
    // It takes the array and current index as parameters.
    // The function prints the element at the current index and calls itself with index - 1.
    // Recursion stops when index becomes less than 0.
    // It does not use any loop or extra array.
    // Demonstrates tail-recursive behavior.
    // Time Complexity: O(n)
    public static void reversePrint(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        reversePrint(arr, index - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Task 7: Reverse Array ---");
        int len = in.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) arr[i] = in.nextInt();
        System.out.print("Reversed: ");
        reversePrint(arr, len - 1);
        System.out.println();
    }
}
