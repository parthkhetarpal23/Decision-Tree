/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root!=null)
        {
            result.addAll(inorderTraversal(root.left));
            result.add(root.val);
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }
}


public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    // method 2: iteration
    Stack<TreeNode> stack = new Stack<>();
    TreeNode cur = root;
    while (cur != null || !stack.isEmpty()) {
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
        cur = stack.pop();
        res.add(cur.val);
        cur = cur.right;
    }
    return res;        
}
