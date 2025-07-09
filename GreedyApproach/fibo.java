import java.util.*;

class fibo {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fib(n, dp));
    }

    public static int fib(int n, int[] dp) {
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
