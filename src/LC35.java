public class LC35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid;

        for (;left <= right;) {
            mid = (left + right) /2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = right - 1;
            }

        }

        return left;

    }
}
