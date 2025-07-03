package GreedyApproach;

import java.util.Arrays;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        int price[] = { 1, 2, 3, 5, 7 };
        int cost = 10;
        int res = buy(price, cost);
        System.out.println(res);
    }

    public static int buy(int price[], int cost) {
        // Arrays.sort(price);
        // int total = price[0] + price[1];
        // if (total <= cost) {
        // return cost - total;

        // } else {
        // return cost;
        // }
        // }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 1; i < price.length; i++) {
            if (price[i] < min1) {
                min2 = min1;
                min1 = price[i];

            } else if (price[i] < min2) {
                min2 = price[i];
            }
        }
        int total = min1 + min2;

        if (total <= cost) {
            return cost - total;
        } else {
            return cost;
        }
    }
}
