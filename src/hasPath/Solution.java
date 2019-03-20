package hasPath;

//这类题目一次就对
public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        boolean flag = false;
        if(str == null || str.length == 0)
            return true;
        for(int i = 0 ; i < rows ; i ++) {
            for(int j = 0; j < cols ; j ++) {
                boolean[] state = new boolean[rows * cols];
                flag = hasPath(matrix,state,rows,cols, i , j , str , 0);
                if (flag)
                    return flag;
            }
        }
        return flag;
    }
    public boolean hasPath(char[] matrix, boolean [] state,int rows, int cols, int i , int j ,char[] str , int k)
    {
        if(str == null || str.length == 0)
            return true;
        //这一步顺序应该放在第三个if的前面。
        if (k == str.length)
            return true;
        if (i < 0 || i >= rows || j < 0 || j >= cols)
            return false;
        if (str[k] == matrix[i * cols + j] && state[i * cols + j] == false) {
            state[i * cols + j] = true;
            return hasPath(matrix, state,rows,cols, i + 1 , j ,str , k + 1) ||
                    hasPath(matrix, state,rows,cols, i - 1 , j ,str , k + 1) ||
                    hasPath(matrix, state,rows,cols, i  , j + 1 ,str , k + 1) ||
                    hasPath(matrix, state,rows,cols, i  , j - 1,str , k + 1);
        }
        return false;
    }
}
