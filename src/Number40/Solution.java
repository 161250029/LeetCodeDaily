package Number40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    Set<List<Integer>> result = new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        combinations(candidates , 0 , target , new ArrayList<>() , 0);
        return new ArrayList<>(result);
    }
    public void combinations(int[] candidates , int index , int target , List<Integer> current , int sum) {
        if(sum == target) {
            result.add(new ArrayList<>(current));
            return;
        }
        else if (sum > target || index == candidates.length)
            return;
        else {
            for(int i = index ; i < candidates.length ; i ++) {
                current.add(candidates[i]);
                combinations(candidates , i + 1 , target , current , sum +candidates[i]);
                current.remove(current.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] sum = {10,1,2,7,6,1,5
};
        System.out.println(solution.combinationSum2(sum , 8));
    }
}
