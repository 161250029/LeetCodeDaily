package movingCount;

//这类题目一次就对
public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
         boolean[] visited = new boolean[rows * cols];
         return getCount(threshold , rows , cols , 0 , 0 ,visited);
    }
    public int getCount(int threshold, int rows, int cols , int i , int j ,boolean[] visited)
    {
            if (i < 0 || i >=rows || j < 0 ||j >=cols)
                return 0;
            if (visited[i * cols + j] == false && check(threshold , i , j)) {
                visited[i * cols + j] = true;
                return 1 + getCount(threshold, rows, cols , i - 1 , j ,visited)
                        + getCount(threshold, rows, cols , i + 1 , j ,visited)
                        + getCount(threshold, rows, cols , i , j - 1,visited)
                        + getCount(threshold, rows, cols , i , j + 1,visited);
            }
            return 0;
    }
    public boolean check(int threshold , int  i , int j)
    {
         int result = 0 ;
         while(i > 0 ) {
             result += i % 10;
             i = i / 10;
         }
         while(j > 0) {
             result += j % 10;
             j = j / 10;
         }
         return result <= threshold;
    }
}
