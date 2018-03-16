package 二叉搜索树与双向链表_36;

public class Solution {

	TreeNode LastNodeInList = null;// 定义一个转换好链表最后一个节点的节点
	
	
	public TreeNode Convert(TreeNode pRootOfTree) {

		ConvertNode(pRootOfTree);// 调用递归
				
		// 此时LastNodeInList指向双链表的尾节点
		// 我们需要返回头节点
		TreeNode HeadOfList = LastNodeInList;
		while (HeadOfList != null && HeadOfList.left != null) {
			HeadOfList = HeadOfList.left;
		}			
		return HeadOfList;
	}

	public void ConvertNode(TreeNode Node) {
		if (Node == null)
			return;

		// 中序遍历左子树
		ConvertNode(Node.left);

		// 操作
		Node.left = LastNodeInList;
		if (LastNodeInList != null) {
			LastNodeInList.right = Node;
		}
		LastNodeInList = Node;

		// 中序遍历右子树
		ConvertNode(Node.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode n10 = new TreeNode(10);
		TreeNode n6 = new TreeNode(6);
		TreeNode n14 = new TreeNode(14);
		TreeNode n4 = new TreeNode(4);
		TreeNode n8 = new TreeNode(8);
		TreeNode n12 = new TreeNode(12);
		TreeNode n16 = new TreeNode(16);
		n10.left = n6;
		n10.right = n14;
		n6.left = n4;
		n6.right = n8;
		n14.left = n12;
		n14.right = n16;

		Solution solution = new Solution();
		solution.Convert(n10);
		

	}

}

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;

	}
}