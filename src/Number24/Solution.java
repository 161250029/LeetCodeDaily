package Number24;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode current = head;
        //注意要想能记录值，不能设置为null;
        ListNode temp = new ListNode(10);
        ListNode result = temp;
        while(current != null && current.next != null) {
            ListNode next = current.next;
            ListNode pos = next.next;
            next.next = current;
            temp.next = next;
            temp = temp.next.next;
            current = pos;
        }
        temp.next = current;
        return result.next;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Solution solution = new Solution();
        System.out.println(solution.swapPairs(node1));
    }
}
