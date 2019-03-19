package GetLeastNumbers_Solution;

import java.util.ArrayList;

//这是网上参考的类快排，它是把判断放在循环外面的，这样感觉更好一点。
public class referenceSolution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (input==null||input.length==0||input.length<k||k<=0) {
            return res;
        }
        int start  = 0;
        int end = input.length-1;
        int index = partition(input, start, end);
        while (index != k - 1) {
            if (index > k - 1) {
                end = index-1;
                index = partition(input, start, end);
            } else {
                start = index+1;
                index = partition(input, start, end);
            }
        }
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }
    static int partition(int input[], int start, int end) {
        int tmp = input[start];
        while (start < end) {
            while (start < end && input[end] >= tmp) {
                end--;
            }
            input[start] = input[end];
            while (start < end && tmp >= input[start]) {
                start++;
            }
            input[end] = input[start];
        }
        input[start] = tmp;
        return start;
    }
}
