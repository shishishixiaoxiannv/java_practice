public class LC27 {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    public int removeElement2(int[] nums, int val) {
        int n = nums.length;
        int left = 0, right = n - 1;

        while(left <= right) {
            if (nums[left] == val) {
                nums[left] = nums[right];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        LC27 res = new LC27();
        int[] nums = new int[]{3, 2, 2, 3};
        int result = res.removeElement2(nums, 3);
        System.out.println(result);
    }
}
