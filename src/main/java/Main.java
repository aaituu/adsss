import java.util.Scanner;

public class Main {
    // This function finds the greatest common divisor (GCD) of two numbers.
    // It uses the Euclidean Algorithm, which recursively applies gcd(b, a % b).
    // The recursion stops when b becomes 0, and then a is the GCD.
    // This method is efficient even for large numbers.
    // Demonstrates mathematical recursion and modulo operation.
    // Frequently used in number theory and fraction simplification.
    // Time Complexity: O(log(min(a, b)))
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Task 10: GCD ---");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.printf("GCD(%d,%d) = %d\n", a, b, gcd(a, b));
    }
}
