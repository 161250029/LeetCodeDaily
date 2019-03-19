package floorHighJump;

public class Solution {
    public int JumpFloorII(int target) {
        int[] times = new int[target + 1];   //跳target步的种类。
        times[1] = 1;
        for(int i = 1 ; i < target + 1; i ++) {
            for(int j = 1 ; j <= i ; j ++) {
                times[i] += times[j];
            }
            times[i] += 1;
        }
        return times[target];
    }
}