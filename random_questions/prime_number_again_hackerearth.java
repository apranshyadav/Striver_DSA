package random_questions;

import java.util.*;

public class prime_number_again_hackerearth {

    static final int MAX = 10000;
    static List<Integer> primatic = new ArrayList<>();
    static int[] dp = new int[MAX + 1];

    public static void main(String[] args) {

        precomputePrimatic();
        precomputeDP();

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int N = sc.nextInt();
            sb.append(dp[N]).append("\n");
        }
        sc.close();
        System.out.print(sb);
    }

    // Step 1: Sieve to get primes
    static void precomputePrimatic() {
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // add all primes
        for (int i = 2; i <= MAX; i++) {
            if (isPrime[i]) primatic.add(i);
        }

        // add p^p values
        primatic.add(4);     // 2^2
        primatic.add(27);    // 3^3
        primatic.add(3125);  // 5^5
    }

    // Step 2: Unbounded knapsack DP
    static void precomputeDP() {
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int p : primatic) {
            for (int i = p; i <= MAX; i++) {
                if (dp[i - p] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - p] + 1);
                }
            }
        }
    }
}

