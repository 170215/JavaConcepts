package DSA.Tree;

public class treeTraversals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static void preorder(TreeNode root) {
		
		
		if(root==null) {
			return;
			
		}
		System.out.println(root.val);
		preorder(root.left);
		preorder(root.right);
	}

}
