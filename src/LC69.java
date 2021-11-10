public class LC69 {
    public int mySqrt(int x) {
        int left = 0, right = x, y = -1;
        int mid = (left + right) / 2;

        while(left <= right) {
            mid = left + (right - left) / 2;
            if ((long)mid * mid <= x) {
                y = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return y;
    }

    public static void main(String[] args) {
        LC69 ans = new LC69();
        int res = ans.mySqrt(4);
        System.out.println(res);

    }
}
