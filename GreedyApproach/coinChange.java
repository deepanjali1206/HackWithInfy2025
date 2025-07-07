import java.util.*;

public class coinChange {
    public static void main(String[] args) {
        int coins[] = { 1, 5, 6, 9 };
        int amt = 11;
        System.out.println(change(coins, amt));

    }

    public static int change(int[] coins, int amt) {
        int[] dp = new int[amt + 1];
        Arrays.fill(dp, amt + 1);
        dp[0] = 0;

        for (int i = 1; i <= amt; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        if (dp[amt] > amt) {
            return -1;
        } else {
            return dp[amt];
        }
    }
}