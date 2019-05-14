package Number31;

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int index = - 1;
        int result = - 1;
        int value = Integer.MAX_VALUE;
        if(nums.length == 1)
            return;
        for(int i = nums.length - 1 ; i > 0 ; i --) {
            if(nums[i] > nums[i - 1]) {
                index = i;
                break;
            }
            if(i == 1) {
                Arrays.sort(nums);
                return;
            }
        }
        int target = nums[index - 1];
        for(int i = index ; i < nums.length ; i ++) {
            if(nums[i] > target && nums[i] < value) {
                result = i;
                value = nums[i];
            }
        }
        nums[index - 1] = nums[result];
        nums[result] = target;
        int[] temp = new int[nums.length - index] ;
        for(int i = index ; i < nums.length ; i ++) {
            temp[i - index] = nums[i];
        }
        Arrays.sort(temp);
        for(int i = index ; i < nums.length ; i ++) {
            nums[i] = temp[i - index];
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] sum = {2,3,1,3,3
        };

        solution.nextPermutation(sum);
    }
}
