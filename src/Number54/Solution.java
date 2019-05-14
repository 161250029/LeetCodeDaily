package Number54;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0)
            return result;
        if(matrix.length== 1) {
            for(int i = 0 ; i < matrix[0].length ; i ++ )
                result.add(matrix[0][i]);
            return result;
        }    
        if(matrix[0].length == 1) {
            for(int i = 0 ; i < matrix.length ; i ++ )
                result.add(matrix[i][0]);
            return result;
        }    
        recurtion(0 , matrix.length - 1 , 0 ,  matrix[0].length - 1 , matrix , result);
        return result;
    }
    public void recurtion(int Xfirst , int Xend , int Yfirst , int Yend , int[][] matrix  , List<Integer> result) {
        if(Xfirst > Xend || Yfirst > Yend)
            return;
        if(Xfirst ==Xend &&Yfirst ==Yend) {
              result.add(matrix[Xfirst][Yfirst]);
              return;
        }    
        if(Xfirst ==Xend)  {
            for(int i = Yfirst ; i <= Yend ; i ++)
              result.add(matrix[Xfirst][i]);
            return;
        }    
        if(Yfirst ==Yend)  {
            for(int i = Xfirst ; i <= Xend ; i ++)
              result.add(matrix[i][Yfirst]);
            return;
        }  
        for(int i = Yfirst ; i < Yend ; i ++)
            result.add(matrix[Xfirst][i]);
        for(int i = Xfirst ; i < Xend ; i ++)
            result.add(matrix[i][Yend]);
        for(int i = Yend ; i > Yfirst ; i --) 
            result.add(matrix[Xend][i]);
        for(int i = Xend ; i > Xfirst ; i --)
            result.add(matrix[i][Yfirst]);
        recurtion(Xfirst + 1 , Xend - 1 , Yfirst + 1 , Yend - 1 , matrix , result);
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}
};
        System.out.println(solution.spiralOrder(nums));
    }
}