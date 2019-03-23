package preorder;

import java.util.ArrayList;
public class Solution {
    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return result;
    }

    public void preorder(TreeNode root) {
        if(root == null)
            return;
        result.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
