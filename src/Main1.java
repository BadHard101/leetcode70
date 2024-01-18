public class Main1 {
    public static int climbStairs(int n) {
        if (n < 3) return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }
}