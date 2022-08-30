package JavaSE.JavaSE12;

public class 牛客输出链表倒数k个结点 {
}

//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
//class Solution {
//    public ListNode FindKthToTail(ListNode head,int k) {
//        if(head == null || k < 0)
//            return null;
//        ListNode slow = head;
//        ListNode fast = head;
//        while (k > 0){
//            k--;
//            if(fast == null)
//                return null;
//            fast = fast.next;
//        }
//        while(fast != null){
//            fast = fast.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
//}