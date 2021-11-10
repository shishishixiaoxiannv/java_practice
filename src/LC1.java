import java.util.Arrays;
import java.util.HashMap;

public class LC1 {
    LC1(){}


    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i){
            for(int j = i + 1; j < n; ++j){
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target){
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        for (; left < right; ){
            if (nums[left] + nums[right] == target) {
                return new int[]{left, right};
            } else if(nums[left] + nums[right] < target){
                left++;
            } else{
                right--;
            }
        }
        return new int[0];
    }

    public int[] twoSum3(int[] nums, int target){
        //Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i){
            if (hashMap.containsKey(target - nums[i])){
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        LC1 sum = new LC1();
        int[] result = sum.twoSum3(new int[]{2, 3, 7, 5}, 10);
        System.out.println(result);
    }
}
