public class costclimb {
    public static void main(String[] args) {
        int cost[] = { 10, 15, 20, 30 };
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);

        }
        System.out.println(dp[n]);

    }

}
