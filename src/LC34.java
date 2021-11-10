public class LC34 {
    public int[] searchRange(int[] nums, int target) {
        int leftId = binarySearch(nums, target, true);
        int rightId = binarySearch(nums, target, false) - 1;
        if (leftId <= rightId && rightId < nums.length && nums[leftId] == target && nums[rightId] == target) {
            return new int[]{leftId, rightId};
        }
        return new int[]{-1, -1};

    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0;
        int right = nums.length - 1;
        int mid, ans = nums.length;

        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}
