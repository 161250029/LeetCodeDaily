package Number3;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int[] index = {
                -1 , -1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1
        };
        int max = 0;
        char[] chars = s.toCharArray();
        if (chars.length == 0)
            return 0;
        for(int i = 0 ; i < chars.length ; i ++) {
            char current = chars[i];
            if(current == ' ')
                continue;
            if (index[current - 'a'] >= start && index[current - 'a'] != -1) {
                max = Math.max(i - start , max);
                start = index[current - 'a'] + 1;

            }
            index[current - 'a'] = i;
        }
        return max;
    }
    public static void main(String[] args) {
       Solution solution = new Solution();
       System.out.println(solution.lengthOfLongestSubstring("  "));
    }
}
