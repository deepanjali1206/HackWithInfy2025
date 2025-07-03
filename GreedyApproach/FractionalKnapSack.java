package GreedyApproach;

import java.util.Arrays;

public class FractionalKnapSack {

    static class Item {
        int value, weight;
        double ratio;

        public Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.ratio = (double) value / weight;
        }
    }

    public static void main(String[] args) {
        int[] val = new int[] { 70, 110, 130 };
        int[] wt = new int[] { 20, 30, 40 };
        int cap = 80;

        Item[] items = new Item[val.length];
        for (int i = 0; i < items.length; i++) {
            items[i] = new Item(val[i], wt[i]);
        }

        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalValue = 0;
        int remainingCapacity = cap;

        for (Item item : items) {
            if (remainingCapacity >= item.weight) {
                totalValue += item.value;
                remainingCapacity -= item.weight;
            } else {
                totalValue += item.ratio * remainingCapacity;
                break;
            }
        }

        System.out.println("Maximum value in Knapsack = " + totalValue);
    }
}

// output - 277.5