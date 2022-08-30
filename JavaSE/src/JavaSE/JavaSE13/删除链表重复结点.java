package JavaSE.JavaSE13;

public class 删除链表重复结点 {
}
//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
//
//class Solution {
//    public ListNode deleteDuplication(ListNode pHead) {
//        if (pHead == null) {
//            return null;
//        }
//
//        ListNode cur = pHead;
//        ListNode newEnd = null;
//        ListNode newHead = null;
//        while (cur != null){
//            if(cur.next != null && cur.val == cur.next.val){
//                while (cur.next != null && cur.val == cur.next.val){
//                    cur = cur.next;
//                }
//                cur = cur.next;
//            }else {
//                if (newHead == null){
//                    newHead = cur;
//                    newEnd = cur;
//                }else{
//                    newEnd.next = cur;
//                    newEnd = newEnd.next;
//                }
//                cur = cur.next;
//            }
//        }
//        if (newEnd != null){    //注意判断如果newEnd为空，会出现空指针异常
//            newEnd.next = null;
//        }
//
//        return newHead;
//    }
//}