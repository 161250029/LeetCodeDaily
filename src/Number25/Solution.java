package Number25;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1)
            return head;
        ListNode pre = null;
        ListNode current = head;
        ListNode result = head;
        int count  = k;
        while(current != null && count > 0) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
            count --;
        }
        if(count == 0){
            result.next = reverseKGroup(current , k);
            result = pre;
            return result;
        }
        else{
            //这里不知道为什么不能直接返回head。
            current = null;
            while(pre != null) {
                ListNode next = pre.next;
                pre.next = current;
                current = pre;
                pre = next;
            }
            return current;
        }
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Solution solution = new Solution();
        System.out.println(solution.reverseKGroup(node1 , 3));
    }
}
