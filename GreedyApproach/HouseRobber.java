public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 9, 3, 1 };
        System.out.println(rob(arr));
    }

    public static int rob(int[] arr) {
        int inc = arr[0];
        int exc = 0;
        for (int i = 1; i < arr.length; i++) {
            int new_inc = exc + arr[i];
            int new_exc = Math.max(inc, exc);
            inc = new_inc;
            exc = new_exc;
        }

        return Math.max(inc, exc);
    }
}
