public class LC209 {
    public int minSubArrayLen(int target, int[] nums){
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        int sum;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum >= target) {
                    if(ans > j - i + 1) {
                        ans = j - i + 1;
                    }
                }
            }
        }
        if (ans == Integer.MAX_VALUE)
            return 0;

        return ans;
    }
//
//    public int minSubArrayLen2(int target, int[] nums) {
//
//    }


}
