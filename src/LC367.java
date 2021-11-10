public class LC367 {
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        int mid = left + (right - left) / 2;
        long square;

        while (left <= right) {
            mid = left + (right - left) / 2;
            square = (long)mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
