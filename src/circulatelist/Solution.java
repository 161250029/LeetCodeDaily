package circulatelist;

//不能加上=，这样结果会出错。
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array == null || array.length == 0)
            return 0;
        for (int i = 0 ; i < array.length - 1 ; i ++) {
            if(array[i] > array[i + 1])
                return array[i + 1];
            if(i == array.length - 2)
                return array[0];
        }
        return array[0];
    }
    public static void main(String args[]) {
        int [] pre = {
                4950,4950,4952,4954,4955,4956,4956,4957,4957,4958,4959,4959,4960,4961,4962,4962,4963,4963,4963,4965
        };
        System.out.println(new Solution().minNumberInRotateArray(pre));
    }
}
