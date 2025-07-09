package GreedyApproach;

import java.util.*;

public class maxEvents {
    public static int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int day = 1, i = 0, n = events.length, count = 0;

        int maxDay = 0;
        for (int[] e : events) {
            maxDay = Math.max(maxDay, e[1]);
        }

        while (day <= maxDay) {

            while (i < n && events[i][0] == day) {
                minHeap.offer(events[i][1]);
                i++;
            }

            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            if (!minHeap.isEmpty()) {
                minHeap.poll();
                count++;
            }

            day++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] events = new int[n][2];

        for (int i = 0; i < n; i++) {
            events[i][0] = sc.nextInt();
            events[i][1] = sc.nextInt();
        }

        System.out.println(maxEvents(events));
    }
}
