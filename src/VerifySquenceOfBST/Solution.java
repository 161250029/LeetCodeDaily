package VerifySquenceOfBST;

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0 || sequence == null)
            return false;
        return isValid(sequence , 0 , sequence.length - 1);
    }
    public boolean isValid(int [] sequence , int start , int end) {
        //判断条件注意一下。
        if(end <= start)
            return true;
        int root = sequence[end];
        int i = start;
        for( ; i < end ; i ++)  {
            if (sequence[i] > root) break;
        }
        for (int j = i ; j < end ; j ++) {
            if (sequence[j] < root) return false;
        }
        return isValid(sequence , start , i - 1) && isValid(sequence , i , end - 1);
    }
}
