public class LC7 {
    public int reverse(int x) {
        int ans = 0;
        int num;

        if (x == 0)
            return 0;

        while (x != 0) {
            if (ans < Integer.MIN_VALUE / 10 || ans > Integer.MAX_VALUE / 10) {
                return 0;
            }
             num = x % 10;
             ans = ans * 10 + num;
             x = x / 10;
        }

        return ans;
    }
}
