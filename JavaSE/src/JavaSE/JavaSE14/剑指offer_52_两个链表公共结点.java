package JavaSE.JavaSE14;

public class 剑指offer_52_两个链表公共结点 {

}

class Solution1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null;
        }
        ListNode cur = headA;
        ListNode cur2;
        int lenA = 0;
        int lenB = 0;
        while(cur != null){
            cur = cur.next;
            lenA++;
        }
        cur = headB;
        while(cur != null){
            cur = cur.next;
            lenB++;
        }
        if (lenB >= lenA){
            int i = 0;
            cur2 = headB;
            cur = headA;
            while (i < lenB - lenA){
                cur2 = cur2.next;
                i++;
            }
        }else {
            int i = 0;
            cur2 = headA;
            cur = headB;
            while (i < lenA - lenB){
                cur2 = cur2.next;
                i++;
            }
        }
        while (cur != cur2){
            cur = cur.next;
            cur2 = cur2.next;
        }
        if (cur == null){
            return null;
        }
        return cur;
    }
}