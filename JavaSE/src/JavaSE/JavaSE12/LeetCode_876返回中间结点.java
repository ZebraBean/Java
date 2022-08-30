package JavaSE.JavaSE12;

public class LeetCode_876返回中间结点 {
}
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
//class Solution {
//    public ListNode middleNode(ListNode head) {
//        ListNode slow = new ListNode();
//        ListNode fast = new ListNode();
//        slow = head;
//        fast = head;
//        while (true){
//            if(fast == null || fast.next == null){
//                return slow;
//            }
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//    }
//}