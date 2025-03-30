import java.util.Scanner;

public class Main {
    // This function checks if a given string contains only digits using recursion.
    // It checks one character at a time, from left to right.
    // If any character is not a digit, it immediately returns false.
    // Recursion stops when the entire string is checked (base case).
    // Demonstrates recursion on string processing.
    // Works for any non-null string.
    // Time Complexity: O(n)
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Task 8: Check Digits ---");
        String s = in.next();
        System.out.println(s + " is " + (isAllDigits(s, 0) ? "All digits" : "Contains non-digit"));
    }
}
