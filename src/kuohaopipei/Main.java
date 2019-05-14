package kuohaopipei;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "()()((()))";
        String str2 = "(()";
        Stack<Character> stack = new Stack<>();
        char[] chars = str2.toCharArray();
        int tempmax = 0;
        int max = 0;
        boolean lastright = false;
        for (int i = 0 ; i < chars.length ; i ++) {
             if (chars[i] == '(') {
                 if (lastright){
                     max = Math.max(tempmax , max);
                     tempmax = 0;
                     lastright = false;
                 }
                 stack.push(')');
             }
             if (chars[i] == ')') {
                 if (stack.size() == 0) {
                     max = Math.max(tempmax , max);
                     tempmax = 0;
                     lastright = false;
                 }
                 else {
                     stack.pop();
                     tempmax++;
                     max = Math.max(tempmax , max);
                     lastright = true;
                 }
             }
        }
        System.out.println(max);
    }
}
