package DS14;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/1/3
 * Time: 17:16
 * Description: No Description
 */
public class 搜索树转双向链表迭代法 {
}
//class Solution {
//    public TreeNode Convert(TreeNode pRootOfTree) {
//        if(pRootOfTree == null){
//            return null;
//        }
//        TreeNode root = null;
//        TreeNode prev = null;
//
//        Stack<TreeNode> stack = new Stack<>();
////        stack.push(pRootOfTree);
////        while (!stack.isEmpty()){
////            TreeNode node = stack.peek();
////            if (node != null){
////                stack.pop();
////                if (node.right != null){
////                    stack.push(node.right);
////                }
////                stack.push(node);
////                stack.push(null);
////                if (node.left != null){
////                    stack.push(node.left);
////                }
////
////            }else {
////                stack.pop();
////                node = stack.pop();
////                if (prev == null){
////                    root = node;
////                }else {
////                    prev.right = node;
////                }
////                node.left = prev;
////                prev = node;
////            }
////        }
//        TreeNode node = pRootOfTree;
//        while(!stack.isEmpty() || node != null){
//            while(node != null){
//                stack.push(node);  //这有这一个push，栈里面存的都是左孩子结点
//                node = node.left;
//            }
//            node = stack.pop();
//            node.left = prev;
//            if(prev == null){
//                root = node;
//            }else{
//                prev.right = node;
//            }
//            prev = node;
//            node = node.right;
//        }
//        return root;
//    }
//}
//class TreeNode {
//    int val = 0;
//    TreeNode left = null;
//    TreeNode right = null;
//
//    public TreeNode(int val) {
//        this.val = val;
//
//    }
//}