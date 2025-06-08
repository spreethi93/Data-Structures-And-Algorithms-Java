public void bfs(TreeNode root) {
  Deque<TreeNode> queue = new ArrayDeque<TreeNode>();
  if(root != null) {
    queue.add(root);
  }
  while(!queue.isEmpty()) {
    for(int i = 0 ; i < queue.size() ; i++) {
      TreeNode curr = queue.removeFirst();
      System.out.print(curr.val);
      if(curr.left != null) {
        queue.add(curr.left);
      } 
      if(curr.right != null) {
        queue.add(curr.right);
      }
    }
  }
}

