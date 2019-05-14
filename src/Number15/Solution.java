package Number15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        int pre = Integer.MIN_VALUE;

        for (int i = 0 ; i < nums.length ; i ++) {
            if (pre == nums[i])
                continue;
            pre = nums[i];
            int target = 0 - nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while(right > left) {
                if (nums[left] + nums[right] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);
                    while(left < nums.length - 1 && nums[left] == nums[left + 1])
                        left ++;
                    while(right > 0 && nums[right] == nums[right - 1])
                        right --;
                    left ++;
                    right --;
                }
                else if (nums[left] + nums[right] > target) {
                    right --;
                }
                else
                    left ++;
            }
        }
        return lists;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(solution.threeSum(nums
));
    }
}
