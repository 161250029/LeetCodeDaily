package reorderList;

public class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode midnext = slow.next;
        ListNode preNode = null;
        ListNode revertNode = null;
        while(midnext != null) {
            ListNode next = midnext.next;
            if(next == null)
                revertNode = midnext;
            midnext.next = preNode;
            preNode = midnext;
            midnext = next;
        }
        slow.next = null;
        ListNode headCurrent = head;
        ListNode midCurrent = revertNode;
        while(headCurrent != null && revertNode != null) {
            ListNode next = headCurrent.next;
            headCurrent.next = revertNode;
            revertNode = revertNode.next;
            headCurrent.next.next = next;
            headCurrent = next;
        }
    }
}
