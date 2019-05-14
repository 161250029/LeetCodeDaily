package Number151;

import java.util.ArrayList;

public class Solution {
    public String reverseWords(String s) {
        String temp = s.trim();
        String[] list =  temp.split(" ");
        ArrayList<String> result = new ArrayList<>();
        for (int i = list.length - 1 ; i >= 0 ; i --) {
            if(!list[i].equals(""))
                result.add(list[i]);
        }
        StringBuffer buffer = new StringBuffer();
        for (int i = 0 ; i < result.size() ; i ++)
            buffer.append(result.get(i)).append(" ");
        return buffer.length() > 1 ?buffer.toString().substring(0 , buffer.toString().length() - 1) : buffer.toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("a good   example"));
    }
}
