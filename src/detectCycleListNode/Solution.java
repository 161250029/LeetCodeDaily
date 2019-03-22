package detectCycleListNode;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                //数学计算，起始点和相遇点一起前进，即为换出
                //2*(a+b) = a + b + n * (b + c);  a = (n - 1) * (b + c) + c;
                ListNode current = head;
                while(current != slow) {
                    slow = slow.next;
                    current = current.next;
                }
                return slow;
            }
        }
        return null;
    }
}
