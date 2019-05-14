package Number5;

public class Solution {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        String result = "";
        String tempresult = "";
        for (int i = 0 ; i < chars.length ; i ++) {
            int pre = i - 1;
            int pos = i + 1;
            while(pre >=0 && pos <= chars.length - 1) {
                if (chars[pre] != chars[pos])
                    break;
                pre -- ;
                pos ++;
            }
            tempresult =  s.substring(pre + 1 , pos);
            result = result.length() > tempresult.length() ? result : tempresult;
            if (i != chars.length - 1 && chars[i] == chars[i + 1]) {
                pre = i - 1;
                pos = i + 2;
                while(pre >=0 && pos <= chars.length - 1) {
                    if (chars[pre] != chars[pos])
                        break;
                    pre -- ;
                    pos ++;
                }
                tempresult = s.substring(pre + 1 , pos);
                result = result.length() > tempresult.length() ? result : tempresult;
            }
            else
                continue;
        }
        return result;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("abcdasdfghjkldcba"));
    }
}
