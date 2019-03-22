package sortList;

public class Solution {
    public ListNode sortList(ListNode head) {
        //归并排序
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode midNext=mid.next;
        //将链表断开
        mid.next=null;
        //各自排序后合并
        return mergeSort(sortList(head),sortList(midNext));
    }

    //利用快慢指针找中间
    private ListNode getMid(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head,quick=head;
        while(quick.next!=null&&quick.next.next!=null){
            slow=slow.next;
            quick=quick.next.next;
        }
        return slow;
    }

    private ListNode mergeSort(ListNode n1,ListNode n2){
        //作为头节点
        ListNode head=new ListNode(0);
        ListNode cur=head;
        ListNode node1=n1;
        ListNode node2=n2;
        while(node1!=null&&node2!=null){
            if(node1.val<node2.val){
                cur.next=node1;
                node1=node1.next;
            }else{
                cur.next=node2;
                node2=node2.next;
            }
            cur=cur.next;
        }
        //把多的接上
        cur.next=node1==null?node2:node1;
        //去除最开始的没用的头节点
        return head.next;
    }
}