package FindKthToTail;

//思路巧妙，和取链表中点的思路很像，需要两个之指针,判断条件需要注意
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        //判断条件忽略
        if(k <= 0) return null;
        ListNode result = new ListNode(10);
        int count = k-1;
        ListNode pre = head;
        ListNode post = head;
        //pre先走k-1步
        while(count > 0) {
            if(pre == null)
                return null;
            pre = pre.next;
            count--;
        }
        //判断条件忽略
        if(pre == null) return null;
        while(pre.next != null) {
            pre = pre.next;
            post = post.next;
        }
        return  post;
    }
}
