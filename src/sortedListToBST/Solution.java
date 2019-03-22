package sortedListToBST;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
            return null;
        ListNode mid = getMid(head);
        ListNode midnext = mid.next;
        mid.next = null;
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(midnext);
        return root;
    }
    public ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
