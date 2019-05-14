package Number16;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = 1000;
        for(int  i = 0 ; i < nums.length ; i ++) {
            for(int j = i + 1 ; j < nums.length ; j ++)  {
                for(int k = j + 1; k < nums.length ; k ++) {
                    int temp = nums[i] + nums[j] + nums[k];
                    result = Math.abs(temp - target)<Math.abs(result - target)? temp : result;
                }
            }
        }
        return result;
    }
}
