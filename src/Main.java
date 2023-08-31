public class Main {
    public static int climbStairs(int n) {
        if (n < 3) return n;
        int prev = 1;
        int res = 2;
        for (int i = 3; i <= n; i++) {
            res += prev;
            prev = res - prev;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
}