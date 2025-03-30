import java.util.Scanner;

public class Main {
    // This function recursively calculates the nth Fibonacci number.
    // Fibonacci numbers are defined as F(0)=0, F(1)=1, F(n)=F(n-1)+F(n-2).
    // This implementation is simple but inefficient for large n.
    // It shows the concept of multiple recursive calls per function.
    // Suitable for small inputs like n <= 30.
    // For better performance, use memoization.
    // Time Complexity: O(2^n)
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Task 5: Fibonacci ---");
        int n = in.nextInt();
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
}
