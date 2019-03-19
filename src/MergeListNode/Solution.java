package MergeListNode;

//这题很简单，但是就是由于各种粗心很多细节没注意到。
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode result = new ListNode(10);
        ListNode temp = new ListNode(-1);
        if(list1.val <= list2.val){
            temp = list1;
            list1 = list1.next;
        }else{
            temp = list2;
            list2 = list2.next;
        }
        result = temp;
        while(list1!= null && list2 != null) {
                if (list1.val <= list2.val) {
                    temp.next = list1;
                    temp = temp.next;
                    list1 = list1.next;
                }
                else {
                    temp.next = list2;
                    temp = temp.next;
                    list2 = list2.next;
                }
        }
        if (list1 == null) {
            temp.next = list2;
        }
        if (list2 == null)
            temp.next = list1;
        return result;
    }
}
