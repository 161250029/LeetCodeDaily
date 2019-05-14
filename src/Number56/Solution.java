package Number56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0 || intervals == null)
            return intervals;
        Arrays.sort(intervals, (o1, o2) -> {
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });
        int index = 0;
        int[][] temp = new int[1][2];
        temp[0][0] = intervals[0][0];
        temp[0][1] = intervals[0][1];
        int target = 0;
        List<int []> list = new ArrayList<>();
        while(index <= intervals.length - 1) {
            if (temp[0][1] >= intervals[index][0]) {
                temp[0][1] = Math.max(intervals[index][1] , temp[0][1]);
                index ++;
            }
            else {
                list.add(temp[0]);
                temp[0] = intervals[index];
                index ++;
                target ++;
            }
        }
        list.add(temp[0]);
        int[][] result = new int[target + 1][2];
        for(int i = 0 ; i <= target ; i ++)
            result[i] = list.get(i);
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = {{1,4},{0,4}};
        System.out.println(solution.merge(intervals));
    }
}
