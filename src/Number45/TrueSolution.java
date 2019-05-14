package Number45;

//使用了贪心就是找出起始节点和最远节点直接能跳到最远距离的地方
public class TrueSolution {
    public int jump(int[] nums) {
        if(nums.length == 1)
            return 0;
        int result = 1;
        int end = nums[0];
        int fartherest = nums[0];
        for(int i = 0 ; i < nums.length ; i ++) {
            fartherest = Math.max(fartherest , i + nums[i]);
            if (end >= nums.length -1)
                break;
            if (i == end) {
                result ++;
                end = fartherest;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        TrueSolution solution = new TrueSolution();
        int[] nums = {
                2,3,1,1,4
        };
        System.out.println(solution.jump(nums));
    }
}
