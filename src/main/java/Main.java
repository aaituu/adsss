import java.util.Scanner;

public class Main {
    // This function calculates C(n, k) — the number of combinations using recursion.
    // Formula used: C(n, k) = C(n-1, k-1) + C(n-1, k)
    // Base cases are C(n, 0) = 1 and C(n, n) = 1.
    // It uses a simple recursive tree structure.
    // Inefficient for large n due to overlapping subproblems.
    // Can be optimized using memoization or dynamic programming.
    // Time Complexity: O(2^n)
    public static int combi(int n, int k) {
        if (k == 0 || k == n) return 1;
        return combi(n - 1, k - 1) + combi(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("--- Task 9: Binomial Coefficient ---");
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.printf("C(%d,%d) = %d\n", n, k, combi(n, k));
    }
}
