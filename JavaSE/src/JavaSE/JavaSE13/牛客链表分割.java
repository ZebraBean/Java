package JavaSE.JavaSE13;

public class 牛客链表分割 {
}
//
//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
//class Partition {
//    public ListNode partition(ListNode pHead, int x) {
//        // write code here
//        if (pHead == null){
//            return null;
//        }
//        ListNode cur = pHead;
//        ListNode bs = null;
//        ListNode be = null;
//        ListNode as = null;
//        ListNode ae = null;
//        while (cur != null){
//            if (cur.val < x){
//                if(bs == null){    //表明这是对bs第一次处理，第一次遇到小于x的数
//                    bs = cur;
//                    be = cur;
//                }else {
//                    be.next = cur;
//                    be = be.next;
//                }
//            }else {
//                if (as == null){    //表明这是对as的第一次处理，即第一次遇到大于等于x的数
//                    as = cur;
//                    ae = cur;
//                }else {
//                    ae.next = cur;
//                    ae = ae.next;
//                }
//            }
//            cur = cur.next;
//        }
//        if(bs == null){    //所有的数都比12大
//            return as;
//        }
//        be.next = as;
//        if (ae != null){    //最后要把ae.next置为空，置空之前要判断ae是否为空，防止空指针异常
//            ae.next = null;
//        }
//        return bs;
//    }
//}