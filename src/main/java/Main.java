import java.util.Scanner;

public class Main {
    // This function recursively calculates the factorial of a number n.
    // The factorial is defined as n * (n-1) * ... * 1, and factorial(0) = 1.
    // The recursion stops when n reaches 1 (base case).
    // It uses simple mathematical recursion to solve the problem.
    // Works correctly for non-negative integers.
    // Demonstrates the core idea of recursion clearly.
    // Time Complexity: O(n)
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Task 4: Factorial ---");
        int n = in.nextInt();
        System.out.println(n + "! = " + factorial(n));
    }
}
