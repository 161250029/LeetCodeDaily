package Number45;

//一开始写的bfs算法，不能保证全过，有的会超时。
class Solution {
    int max = Integer.MAX_VALUE;
    public int jump(int[] nums) {
        getMax(nums , 0 , 0 , nums.length - 1);
        return  max;
    }

    public void getMax(int[] nums , int index , int count , int length) {
        if(index > length)
            return;
        int largejump = nums[index];
        if(index == length) {
            max = Math.min(count , max);
            return;
        }
        for(int i = largejump ; i >= 1 ; i --) {
            getMax(nums , index + i , count + 1 , length);
        }
        return;
    }
}
