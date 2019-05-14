package Number18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        int prei = Integer.MIN_VALUE;
        int prej = Integer.MIN_VALUE;

        for (int i = 0 ; i < nums.length ; i ++) {
            if (prei == nums[i])
                continue;
            prei = nums[i];
            prej = Integer.MIN_VALUE;
            for(int j = i + 1 ; j < nums.length ; j ++) {
                if (prej == nums[j])
                    continue;
                prej = nums[j];
                int temp = target - nums[i] - nums[j];
                int left = j + 1;
                int right = nums.length - 1;
                while(right > left) {
                    if (nums[left] + nums[right] == temp) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
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
                    else if (nums[left] + nums[right] > temp) {
                        right --;
                    }
                    else
                        left ++;
                }
            }
        }
        return lists;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-7,-5,0,7,1,1,-10,-2,7,7,-2,-6,0,-10,-5,7,-8,5};
        System.out.println(solution.fourSum(nums , 28
        ));
    }
}
