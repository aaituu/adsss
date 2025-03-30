import java.util.Scanner;

public class Main {
    // This function checks whether a given number is a prime.
    // A prime number is divisible only by 1 and itself.
    // The check is optimized to run up to the square root of n.
    // If any number in the loop divides n evenly, it's not a prime.
    // It returns true for primes, and false otherwise.
    // This function uses iteration, not recursion.
    // Time Complexity: O(√n)
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Task 3: Check Prime ---");
        int n = in.nextInt();
        System.out.println(n + " is " + (isPrime(n) ? "Prime" : "Composite"));
    }
}
