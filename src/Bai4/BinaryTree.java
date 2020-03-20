package Bai4;

class Node {
	int value;
	Node left, right, nextRight;

	Node(int a) {
		value = a;
		left = right = nextRight = null;
	}
}

class BinaryTree {
	Node root1, root2;

	boolean areSame(Node root1, Node root2) {

		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null)
			return false;

		return (root1.value == root2.value && areSame(root1.left, root2.left) && areSame(root1.right, root2.right));
	}

	boolean isSubtree(Node T1, Node T2) {

		if (T2 == null)
			return true;

		if (T1 == null)
			return false;

		if (areSame(T1, T2))
			return true;

		return isSubtree(T1.left, T2) || isSubtree(T1.right, T2);
	}

	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();

		tree.root1 = new Node(5);
		tree.root1.left = new Node(7);
		tree.root1.left.left = new Node(1);
		tree.root1.left.right = new Node(2);
		tree.root1.left.left.right = new Node(5);
		tree.root1.right = new Node(4);
		tree.root1.right.right = new Node(8);

		tree.root2 = new Node(7);
		tree.root2.left = new Node(1);
		tree.root2.left.right = new Node(5);
		tree.root2.right = new Node(2);

		if (tree.isSubtree(tree.root1, tree.root2))
			System.out.println("T2 la subtree cua T1");
		else
			System.out.println("T2 ko la subtree cua T1");
	}
}