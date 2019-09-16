package leetcodeMedium;

public class FlattenBTToLinkedList {
	public static TreeNode prev = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right = new TreeNode(15);
		root.right.right = new TreeNode(18);
		flatten(root);
		System.out.println(root.left);
		System.out.println(root.right.val);
	}
	public static void flatten(TreeNode root) {
		if(root == null) {
			return;
		}
		dfs(root);
	}
	public static void dfs(TreeNode root) {
		if(root == null) {
			return;
		}
		dfs(root.right);
		dfs(root.left);
		root.right = prev;
		root.left = null;
		prev = root;
	}
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}