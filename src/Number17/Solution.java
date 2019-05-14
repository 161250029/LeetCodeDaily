package Number17;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
       getAll(digits , "" , 0);
       return result;
    }
    public void getAll(String digits , String current , int index) {
        String[] text = invert(digits.charAt(index));
        if(digits == null || digits.length() == 0)
            return;
        if(index == digits.length()) {
            for (int i = 0 ; i < text.length ; i ++) {
                result.add(current + text[i]);
            }
            return;
        }
        else
            for (int i = 0 ; i < text.length ; i ++)
                getAll(digits , current + text[i] , index + 1);
    }

    public String[] invert(char c) {
        switch (c) {
            case '2':
                String[] result = {"a" , "b" ,"c"};
                return result;
            case '3':
                String[] result1 = {"d" , "e" ,"f"};
                return result1;
            case '4':
                String[] result2 = {"g" , "h" ,"i"};
                return result2;
            case '5':
                String[] result3 = {"j" , "k" ,"l"};
                return result3;
            case '6':
                String[] result4 = {"n" , "m" ,"o"};
                return result4;
            case '7':
                String[] result6 = {"p" , "q" ,"r" , "s"};
                return result6;
            case '8':
                String[] result7 = {"t" ,"u" , "v"};
                return result7;
            case '9':
                String[] result8 = {"w" , "x" ,"y" , "z"};
                return result8;
            default:
                return null;
        }
    }
}
