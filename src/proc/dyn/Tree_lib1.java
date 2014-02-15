package proc.dyn;

public class Tree_lib1 {

	/**
	 *     Разработать класс-библиотеку для работы с бинарными деревьями. А именно 4 метода:
		public class BinaryTreeUtils {

		public static int size(TreeNode root) {...}

		public static int height(TreeNode root) {...}

    		public static int sum(TreeNode root) {...}

    		public static int max(TreeNode root) {...}

}

}
	 */
	
	static int i = 5, level = 0;
	
	public static void main(String[] args) {
	TreeNode r = gen(null, i);
	System.out.println("!!! "+ r.value);
	System.out.println("MAX: " + max(r));
	System.out.println("HEIGHT: " + height(r));
	System.out.println("SIZE: " + size(r));
	System.out.println("SUM: " + sum(r));
		
	}
	
	public static TreeNode gen(TreeNode root, int i){
		
			//TreeNode tmp = root;
			root = new TreeNode(i, null, null);
			TreeNode tmp = root;
			tmp.left = new TreeNode(++i, null, null);
			tmp.right = new TreeNode(++i, null, null);
			tmp.left = tmp.left;
			tmp.left = new TreeNode(++i, null, null);
			tmp.right = new TreeNode(++i, null, null);
			
		
		return root;
	}
	
	
	
	static int sum(TreeNode root) {
		return (root == null) ? 0 : root.value + sum(root.left) + sum(root.right);
	}
	
	public static int max(TreeNode root) {
		
		if(root == null){
			return -1;
		} 
		else {
		int x = root.value;
		int y = max(root.left);
		int z = max(root.right);
		
		if(x < y){
			x = y;
		}
		if (x < z){
			x = z;
		}
		
		return x;
		}
	}
	
	public static int height(TreeNode root) {
		if(root == null) {
			return 0;
		}
		else {
		int l = height(root.left);
		int r = height(root.right);
		
		if(l <= r) {
			l = r;
		}
		return 1 + l;
		}
	}
	
	public static int size(TreeNode root) {
		if(root == null) {
			return 0;
		}
		else {
		int r = height(root.right);
		int l = height(root.left);
		
		
		
		return 1 + r + l;
		}
	}
}



class TreeNode{
	int value;
	TreeNode right;
	TreeNode left;
	
	TreeNode(int v, TreeNode r, TreeNode l){
		value = v;
		right = r;
		left = l;
		
	}
}
