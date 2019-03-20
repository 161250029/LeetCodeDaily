package KthNode;
//一遍就过，思路正确。 通过写一个辅助方法求出对应树下的节点个数，就迎刃而解了
public class Solution {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot == null)
            return null;
        if(k <= 0)
            return null;
        int leftCount = getCount(pRoot.left);
        int rightCount = getCount(pRoot.right);
        if(k > leftCount + rightCount + 1)
            return null;
        else if(k == leftCount + 1)
            return pRoot;
        else if(k < leftCount + 1)
            return KthNode(pRoot.left , k);
        else
            return KthNode(pRoot.right , k -1 - leftCount);
    }

    int getCount(TreeNode node) {
        if(node == null)
            return 0;
        return 1 + getCount(node.left) + getCount(node.right);
    }
}
