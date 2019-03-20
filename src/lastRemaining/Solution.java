package lastRemaining;

import java.util.ArrayList;

//经典的约瑟夫问题
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(m ==0 || n == 0)
            return -1;
        ArrayList<Integer> numbers = new ArrayList<>();
        int count = 0;
        int index = 0;
        for(int i = 0 ; i < n ; i ++) {
            numbers.add(i);
        }
        while(numbers.size() > 1) {
            if(count < m - 1){
                count ++;
                index ++;
                if(index > numbers.size() - 1)
                    index = 0;
            }
            if(count == m -1) {
                numbers.remove(index);
                count = 0;
                if(index > numbers.size() - 1)
                    index = 0;
            }
        }
        return numbers.get(0);
    }
    public static void main(String args[]) {
        System.out.println(new Solution().LastRemaining_Solution(5 ,3));
    }
}
