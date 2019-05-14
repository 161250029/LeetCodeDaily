package sumNumbersTreeNode;

import java.util.ArrayList;

public class Solution {
    public int sumNumbers(TreeNode root) {
        int result = 0 ;
        ArrayList<Integer> lists = new ArrayList<Integer>();
        sumNumbers(root , 0 , lists);
        for(int i = 0 ; i < lists.size() ; i ++) {
            result += lists.get(i);
        }
        return result;
    }
    public void sumNumbers(TreeNode root , int value , ArrayList<Integer> lists) {
        //第一步要注意，如果是空节点的话，不要把value添加进去，而是直接返回。
        if (root == null) {
            return ;
        }
        if (root.left == null && root.right == null){
            lists.add(value * 10 + root.val);
            return;
        }
        sumNumbers(root.left , value*10 + root.val , lists);
        sumNumbers(root.right , value* 10 + root.val , lists);
    }

}