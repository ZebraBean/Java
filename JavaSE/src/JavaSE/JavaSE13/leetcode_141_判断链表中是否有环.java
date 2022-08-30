package JavaSE.JavaSE13;

public class leetcode_141_判断链表中是否有环 {
}

//  class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) {
//        val = x;
//         next = null;
//    }
// }
//
//class Solution {
//    public boolean hasCycle(ListNode head) {
//        if (head == null){
//            return false;
//        }
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast != null && fast.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                return true;
//            }
//        }
//        return false;
//    }
//}