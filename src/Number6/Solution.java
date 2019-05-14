package Number6;

public class Solution {
    public String convert(String s, int numRows) {
        int length = s.length();
        int target = 2 * numRows - 2;
        StringBuffer stringbuffer = new StringBuffer();
        if (numRows == 1)
            return s;
        for(int i = 0 ; i < numRows ; i ++) {
            int target1 = i;
            int target2 = target - i;
            if (i == 0 || i == numRows - 1) {
                while(target1 <= length - 1) {
                        stringbuffer.append(s.substring(target1 , target1 + 1));
                    target1 += target;
                }
            }
            else {
                while(target1 <= length - 1 || target2 <= length - 1) {
                    if(target2 > length - 1)
                        stringbuffer.append(s.substring(target1 , target1 + 1));
                    else
                        stringbuffer.append(s.substring(target1 , target1 + 1)).append(s.substring(target2 , target2 + 1));
                    target1 += target;
                    target2 += target;
                }
            }
        }
        return stringbuffer.toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("A" , 1));
    }
}
