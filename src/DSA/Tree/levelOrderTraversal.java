package DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(20);
        root.left = new TreeNode(30);
        root.right= new TreeNode(10);
        root.left.left = new TreeNode(50);
        root.left.right = new TreeNode(70);
        root.right.left= new TreeNode(15);
        root.right.right= new TreeNode(60);
        
//        levelOrderTraversal(root);
//        TraversalMethod(root);
        leftView(root);
        System.out.println("next");
        rightView(root);
	}

	private static void rightView(TreeNode root) {
		// TODO Auto-generated method stub
        Queue<TreeNode> q = new LinkedList<>();
		
		q.offer(root);
        q.offer(null);
        System.out.print(q.peek().val);
		while(!q.isEmpty()) {
			TreeNode x= q.poll();
			if(x==null) {
				if(q.isEmpty()) {
					break;
				}
				System.out.println();
				System.out.print(q.peek().val);
				q.offer(null);
				
			}
			else {
				
	            if(x.right!=null) {
	            	q.offer(x.right);
				}
	            if(x.left!=null) {
					q.offer(x.left);
				}
//	            System.out.print(x.val+ " ");
				
			}
			
		}
		
	}

	private static void leftView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
		
		q.offer(root);
        q.offer(null);
        System.out.print(q.peek().val);
		while(!q.isEmpty()) {
			TreeNode x= q.poll();
			if(x==null) {
				if(q.isEmpty()) {
					break;
				}
				System.out.println();
				System.out.print(q.peek().val);
				q.offer(null);
				
			}
			else {
				if(x.left!=null) {
					q.offer(x.left);
				}
	            if(x.right!=null) {
	            	q.offer(x.right);
				}
//	            System.out.print(x.val+ " ");
				
			}
			
		}
		
		System.out.println();
		
		
	}

	private static void TraversalMethod(TreeNode A) {
		// TODO Auto-generated method stub
		
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(A);
       while(!q.isEmpty()){
           
          
               TreeNode x= q.poll();
               if(x.left!=null){
                   q.offer(x.left);
               }
               if(x.right!=null){
                   q.offer(x.right);
               }
               
           
           System.out.println(x.val);}
       
	}

	private static void levelOrderTraversal(TreeNode root) {
		// TODO Auto-generated method stub
		
		Queue<TreeNode> q = new LinkedList<>();
		
		q.offer(root);
        q.offer(null);
		
		while(!q.isEmpty()) {
			TreeNode x= q.poll();
			if(x==null) {
				if(q.isEmpty()) {
					break;
				}
				System.out.println();
				q.offer(null);
				
			}
			else {
				if(x.left!=null) {
					q.offer(x.left);
				}
	            if(x.right!=null) {
	            	q.offer(x.right);
				}
	            System.out.print(x.val+ " ");
				
			}
			
		}
		
		
		
	}
	

}
