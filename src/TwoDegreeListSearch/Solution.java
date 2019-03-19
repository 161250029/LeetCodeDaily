package TwoDegreeListSearch;
//我是从第一行最后一个元素开始进行递归，target小了就向左查，大了就向下查
//别人的思路是从最后一行第一个开始查，思路是一样的。
//其实我在想从第一个元素开始也是可行的，target大了就向下和向右查，小了就return false;
public class Solution {
    public boolean Find(int target, int [][] array) {
        //这步判断条件一开始漏了。
        if (array == null || array[0].length == 0)
            return false;
        return isValid(target , 0 , array[0].length - 1 , array);
    }
    public boolean isValid(int target , int i , int j , int [][] array) {
        if(i == 0 && j == 0 && target != array[0][0])
            return false;
        if(target == array[i][j])
            return true;
        else if(target < array[i][j]) {
            if (j == 0)
                return false;
            else
                return isValid(target , i , j - 1 , array);
        }
        else {
            if (i == array.length - 1)
                return false;
            else
                return isValid(target , i + 1 , j, array);
        }
    }

    public static void main(String args[]) {
        int [][] array = {
                {

                }
        };
        System.out.println(new Solution().Find(16 , array));
    }
}
