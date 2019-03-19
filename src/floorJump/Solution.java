package floorJump;

public class Solution {
    public int JumpFloor(int target) {
        if(target == 0)
            return 0;
        if(target == 1)
            return 1;
        if(target == 2)
            return 2;
        //第一次跳两步，第一次跳一步
        return JumpFloor(target - 1) +JumpFloor(target - 2);
    }
}
