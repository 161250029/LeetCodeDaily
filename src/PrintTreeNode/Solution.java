package PrintTreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
//完美的实现，两个队列，两个队列轮流输出，确保是同一层的
public class Solution {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayDeque<TreeNode> Inqueue = new ArrayDeque<>();
        ArrayDeque<TreeNode> Outqueue = new ArrayDeque<>();
        if(pRoot == null)
            return lists;
        Inqueue.add(pRoot);
        //方便申明list变量
        boolean flag = true;
        while(!Inqueue.isEmpty() || !Outqueue.isEmpty()) {
            if (flag) {
                ArrayList<Integer> list = new ArrayList<>();
                while(!Inqueue.isEmpty()) {
                    TreeNode current = Inqueue.getFirst();
                    list.add(current.val);
                    if (current.left != null)
                        Outqueue.add(current.left);
                    if (current.right != null)
                        Outqueue.add(current.right);
                    Inqueue.removeFirst();
                }
                flag = false;
                lists.add(list);
            }
            else {
                ArrayList<Integer> list = new ArrayList<>();
                while (!Outqueue.isEmpty()) {
                    TreeNode current = Outqueue.getFirst();
                    list.add(current.val);
                    if (current.left != null)
                        Inqueue.add(current.left);
                    if (current.right != null)
                        Inqueue.add(current.right);
                    Outqueue.removeFirst();
                }
                flag = true;
                lists.add(list);
            }
        }
        return lists;
    }
}