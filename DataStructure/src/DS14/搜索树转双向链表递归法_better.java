package DS14;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2022/1/3
 * Time: 18:28
 * Description: No Description
 */
public class 搜索树转双向链表递归法_better {
}
class Solution {
    TreeNode head = null;
    TreeNode last = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        preOrder(pRootOfTree);
        return head;
    }
    public void preOrder(TreeNode root){
        if (root != null){
            preOrder(root.left);
            add(root);
            preOrder(root.right);
        }
    }
    public void add(TreeNode node){
        if (last == null){
            head = node;
            last = node;
        }else {
            last.right = node;
            node.left = last;
            last = node;
        }
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}