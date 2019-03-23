package minimum_depth_binary_tree;

//一遍过
public class Solution {
    public int run(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        if(root.left == null)
            return 1 + run(root.right);
        if(root.right == null)
            return 1 + run(root.left);
        if(run(root.left) < run(root.right))
            return 1 + run(root.left);
        return 1 + run(root.right);
    }
}
