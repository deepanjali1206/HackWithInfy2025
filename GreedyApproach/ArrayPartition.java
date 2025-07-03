package GreedyApproach;

import java.util.Arrays;

public class ArrayPartition {

    public static void main(String[] args) {
        int nums[] = { 1, 4, 3, 2 };

        int res = pair(nums);
        System.out.println("Maximum sum of minimums: " + res);
    }

    public static int pair(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}
