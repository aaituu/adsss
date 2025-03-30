import java.util.Scanner;

public class Main {
    // This function calculates a raised to the power of n using recursion.
    // The base case is a^0 = 1.
    // It multiplies 'a' recursively until the exponent becomes zero.
    // This is a basic implementation, not optimized (like fast exponentiation).
    // Suitable for small values of n.
    // Demonstrates simple recursion with decreasing exponent.
    // Time Complexity: O(n)
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Task 6: Power a^n ---");
        int a = in.nextInt();
        int n = in.nextInt();
        System.out.printf("%d^%d = %d\n", a, n, power(a, n));
    }
}
