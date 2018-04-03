package 二叉搜索树的第k大节点_54;

import java.util.LinkedList;

public class Solution {
	 int index = 0; //计数器
	 TreeNode KthNode(TreeNode pRoot, int k) {
		 if(pRoot != null){ //中序遍历寻找第k个
	            TreeNode node = KthNode(pRoot.left,k);
	            if(node != null)
	                return node;
	            index ++;
	            if(index == k)
	                return pRoot;
	            node = KthNode(pRoot.right,k);
	            if(node != null)
	                return node;
	        }
	        return null;
		
		
	 }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node1=new TreeNode(5);
		TreeNode node2=new TreeNode(3);
		TreeNode node3=new TreeNode(7);
		TreeNode node4=new TreeNode(2);
		TreeNode node5=new TreeNode(4);
		TreeNode node6=new TreeNode(6);
		TreeNode node7=new TreeNode(8);
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		node3.left=node6;
		node3.right=node7;
		
		Solution s=new Solution();
		TreeNode res=s.KthNode(node1, 3);
		System.out.println(res.val);

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