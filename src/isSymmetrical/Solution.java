package isSymmetrical;

//思路很重要，直接用递归来做是不行的；根据题意先得到tree的镜像，再比较是否是同一颗树即可
public class Solution {
    boolean isSymmetrical(TreeNode pRoot)
    {
        TreeNode node = getMirror(pRoot);
        return isValid(pRoot , node);
    }
    boolean isValid(TreeNode pRoot ,TreeNode node)
    {
        if(pRoot == null && node == null)
            return true;
        if(pRoot == null || node == null)
            return false;
        if(node.val == pRoot.val)
            return isValid(pRoot.left , node.left) && isValid(pRoot.right , node.right);
        return false;
    }
    TreeNode getMirror(TreeNode root) {
        if(root == null)
            return null;
        TreeNode left = root.left;
        TreeNode right = root.right;
        TreeNode result = new TreeNode(root.val);
        result.right = getMirror(left);
        result.left = getMirror(right);
        return result;
    }
}
