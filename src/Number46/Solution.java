package Number46;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permuteAll(nums , 0 , nums.length - 1);
        return result;
    }
    public void permuteAll(int[] nums , int index , int end) {
        if(index== end + 1){
            List<Integer> list = new ArrayList<>();
            for(int s : nums)
                list.add(s);
            result.add(list);
            return;
        }
        for(int i = index ; i <=end ;  i ++) {
            swap(i,index ,nums);
            permuteAll(nums , index + 1 , end );
            swap(i ,index , nums);
        }
    }
    public void swap(int i , int j , int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1 ,2 ,3};
        System.out.println(solution.permute(nums));
    }
}
