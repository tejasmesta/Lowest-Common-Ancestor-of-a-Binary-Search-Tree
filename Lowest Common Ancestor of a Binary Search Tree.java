class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        boolean t = true;
        
        TreeNode ans = root;
        
        while(t)
        {
            if(ans.val<p.val && ans.val<q.val)
            {
                ans = ans.right;
            }
            else if(ans.val>p.val && ans.val>q.val)
            {
                ans = ans.left;
            }
            else{
                t = false;
            }
        }
        
        return ans;
    }
}
