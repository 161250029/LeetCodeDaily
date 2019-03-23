package postorder;

import java.util.ArrayList;
public class Solution {
    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return result;
    }

    public void postorder(TreeNode root) {
        if(root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        result.add(root.val);
    }
}
