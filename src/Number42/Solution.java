package Number42;

class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int max = 0;
         int[] right = new int[length];
         int[] left = new int[length];
         for(int i = 1 ; i < length ; i ++)
             left[i] = Math.max(left[i - 1] , height[i - 1]);
         for (int i = length - 2 ; i >= 0 ; i --)
             right[i] = Math.max(right[i + 1] , height[i + 1]);
         for (int i = 1 ; i < length - 1 ; i ++)
             max += right[i] > height[i] && left[i] > height[i] ? Math.min(right[i] , left[i]) - height[i] : 0;
         return max;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1
};
        System.out.println(solution.trap(nums));
    }
}
