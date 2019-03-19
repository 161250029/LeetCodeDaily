package StackToQueue;

import java.util.Stack;

//一遍过
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int node = -1;
        if (stack2.size() != 0) {
            node = stack2.peek();
            stack2.pop();
        }
        else {
            int temp = -1;
            while(!stack1.isEmpty()) {
                temp = stack1.peek();
                stack1.pop();
                stack2.push(temp);
            }
            node = stack2.peek();
            stack2.pop();
        }
            return node;
    }
}