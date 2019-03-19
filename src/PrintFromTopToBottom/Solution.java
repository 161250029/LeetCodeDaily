package PrintFromTopToBottom;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        ArrayDeque<TreeNode> treeNodes = new ArrayDeque<>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()) {
            TreeNode current = treeNodes.getFirst();
            treeNodes.removeFirst();
            result.add(current.val);
            if (current.left != null)
                treeNodes.add(current.left);
            if (current.right != null)
                treeNodes.add(current.right);
        }
        return result;
    }
}
