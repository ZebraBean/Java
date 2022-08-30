package JavaSE.JavaSE13;

public class leetcode_142_判断有环并返回入口点 {
}
//  class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) {
//          val = x;
//          next = null;
//      }
//  }
//class Solution {
//    public ListNode detectCycle(ListNode head) {
//        if (head == null){
//            return null;
//        }
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast != null && fast.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(fast == slow){
//                slow = head;
//                while (slow != fast){    //尽量不要while(true)
//                    slow = slow.next;
//                    fast = fast.next;
//                }
//                return slow;
//            }
//        }
//        return null;
//    }
//}