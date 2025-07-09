package GreedyApproach;

import java.util.*;

public class DIStringMatch {
    public static int[] stringMatch(String s) {
        int n = s.length();
        int low = 0;                                                            
        int high = n;
        int[] res = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                res[i] = low;
                low++;
            } else {
                res[i] = high;
                high--;
            }
        }
        res[n] = low;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int[] res = stringMatch(s);
        System.out.println(Arrays.toString(res));
    }
}
