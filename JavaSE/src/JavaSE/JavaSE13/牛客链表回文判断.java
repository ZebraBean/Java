package JavaSE.JavaSE13;

public class 牛客链表回文判断 {
}

//class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
//class PalindromeList {
//    public boolean chkPalindrome(ListNode A) {
//        // write code here
//        boolean isOdd;
//        boolean ans = true;
//        ListNode slow = A;
//        ListNode slowPre = null;
//        ListNode slowNext = A;
//        ListNode fast = A;
//        while (true){    //找中间结点
//            if (fast == null){    //如果是以fast == null结束，则表明链表有偶数个结点
//                isOdd = false;
//                break;
//            }
//            if (fast.next == null){    //如果是以fast.next == null结束，则表明链表有奇数个结点
//                isOdd = true;
//                break;
//            }
//            fast = fast.next.next;
//            //在找中间结点的同时，用三指针法对前半段链表进行反转
//            slowNext = slow.next;
//            slow.next = slowPre;
//            slowPre = slow;
//            slow = slowNext;
//        }
//        if (isOdd == true) {   //如果是奇数个，slow往后走一个
//            slow = slow.next;
//        }
//        while(slow != null){
//            if (slow.val != slowPre.val){
//                ans = false;
//            }
//            slow = slow.next;
//            slowPre = slowPre.next;
//        }
//        return ans;
//    }
//}