import java.util.Arrays;

public class LC977 {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] * nums[i];
        }
        Arrays.sort(res);
        return res;
    }

    public int[] sortedSquares2(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int neg = -1;

        for (int k = 0; k < n; k++) {
            if(nums[k] < 0) {
                neg = k;
            } else {
                break;
            }
        }

        int i = neg, j = neg + 1, index = 0;

        for (; i >= 0 || j < n; ) {
            if (i < 0 ) {
                res[index] = nums[j] * nums[j];
                ++j;
            } else if (j == n ) {
                res[index] = nums[i] * nums[i];
                --i;
            } else if (nums[i] * nums[i] < nums[j] * nums[j]) {
                res[index] = nums[i] * nums[i];
                --i;
            } else {
                res[index] = nums[j] * nums[j];
                ++j;
            }

            ++index;
        }

        return res;
    }

    public int[] sortedSquares3(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int i = 0, j = n - 1, index = n - 1;

        for (;i <= j;) {
            if (nums[i] * nums[i] < nums[j] * nums[j]) {
                res[index] = nums[j] * nums[j];
                --j;
            } else {
                res[index] = nums[i] * nums[i];
                ++i;
            }
            --index;
        }

        return res;
    }

}
