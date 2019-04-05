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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> wrap = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)
            return wrap;
        q.offer(root);
        while(!q.isEmpty())
        {
            int levelNum = q.size();
            List<Integer> sublist = new LinkedList<>();
            for(int i=0;i<levelNum;i++)
            {
                if(q.peek().left!=null)
                    q.add(q.peek().left);
                if(q.peek().right!=null)
                    q.add(q.peek().right);
                sublist.add(q.poll().val);
            }
            wrap.add(sublist);
        }
        return wrap;
        
    }
}
