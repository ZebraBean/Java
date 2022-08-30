package JavaSE.JavaSE12;

public class LeetCode_206链表逆置 {

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode cur = head;
        ListNode pre = null;
        ListNode curNext = null;
        ListNode newhead = null;
        while (cur != null){   //整个过程画图理解
            curNext = cur.next;
            if (curNext == null){   //表明cur已经是最后一个结点了
                newhead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return newhead;
    }



//    public ListNode reverseList(ListNode head) {
//        if (head == null){
//            return null;
//        }
//
//        ListNode last = head;
//        ListNode cur = head.next;
//        ListNode temp;
//
//        while (cur != null){
//            temp = cur;
//            cur = cur.next;
//            temp.next = head;
//            head = temp;
//        }
//        last.next = null;
//        return head;
//    }
}
