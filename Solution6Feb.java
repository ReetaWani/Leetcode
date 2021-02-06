



class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return result;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                TreeNode currentNode = queue.poll();
                if(i==0) result.add(currentNode.val);
                if(currentNode.right!=null) queue.offer(currentNode.right);
                if(currentNode.left!=null) queue.offer(currentNode.left);
            }
        }
        return result;
    }
}
