package revertBinaryTree;

//又实现一条递归，开心
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || pre == null || in.length == 0 ||in == null)
            return null;
        TreeNode tree = new TreeNode(pre[0]);
        int index = searchRootIndex(in , pre[0]);
        TreeNode left = reConstructBinaryTree(getLeftPre(pre , index) , getLeftIn(in , index));
        TreeNode right = reConstructBinaryTree(getRightPre(pre , index) , getRightIn(in , index));
        tree.left = left;
        tree.right = right;
        return tree;
    }

    public int searchRootIndex(int[] in , int val) {
        int index = -1;
        for(int i = 0 ; i < in.length ; i ++) {
            if(val == in[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
    public int[] getLeftPre(int [] pre , int index) {
        int [] Pre = new int [index];
        for(int i = 1 ; i <= index; i ++)
            Pre[i - 1] = pre[i];
        return Pre;
    }
    public int[] getLeftIn(int [] in ,int index) {
        int [] In = new int [index];
        for(int i = 0 ; i < index; i ++)
            In[i] = in[i];
        return In;
    }
    public int[] getRightPre(int [] pre , int index) {
        int [] Pre = new int [pre.length - index - 1];
        for(int i = index + 1 ; i <= pre.length - 1; i ++)
            Pre[i - 1 - index] = pre[i];
        return Pre;
    }
    public int[] getRightIn(int [] in , int index) {
        int [] In = new int [in.length - index - 1];
        for(int i = index + 1 ; i <= in.length - 1; i ++)
            In[i - 1 - index] = in[i];
        return In;
    }

    public static void main(String args[]) {
        int [] pre = {
                1,2,3,4,5,6,7
        };
        int [] in = {
                3,2,4,1,6,5,7
        };
        new Solution().reConstructBinaryTree(pre , in);
    }
}
