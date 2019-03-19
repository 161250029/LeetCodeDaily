package GetLeastNumbers_Solution;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> list = new ArrayList<>();
        if(k == 0 || k > input.length)
            return list;
        getKth(input , k ,0 , input.length - 1);
        for(int i = 0 ; i < k ; i ++) {
            list.add(input[i]);
        }
        return list;
    }

    public void getKth(int [] input, int k , int start , int end) {
        int temp = input[start];
        int low = start;
        int high = end;
        while(low < high) {
            while(temp <= input[high] && high > low && high > start)
                high--;
            input[low] = input[high];
            while(temp >= input[low] && high > low && low < end)
                low++;
            input[high] = input[low];
        }
        input[high] = temp;
        if(k < (high - start + 1)) {
            getKth(input , k , start , high - 1);
        }
        //这一笔很致命，千万要加上else如果是if的话，如果执行的是上一句if语句的话，如果内层getKth退出来的时候，还会调用这句，造成死循环，加上else就表名执行了上一句就不会执行这句了
        else if(k == (high - start + 1)) {
            return;
        }
        else
            getKth(input , k-high -1 + start, high + 1 , end);
    }
    public static void main(String args[]) {
        int [] array = {
                4,1,2,434,5,6676,8        };
        System.out.println(new Solution().GetLeastNumbers_Solution(array , 2));
    }
}
