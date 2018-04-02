package ¶Ô³ÆµÄ¶þ²æÊ÷_28;

public class Solution {
	boolean isSymmetrical(TreeNode pRoot) {
		return isSymmetrical(pRoot,pRoot);
	}

	private boolean isSymmetrical(TreeNode pRoot1, TreeNode pRoot2) {
		if(pRoot1==null&&pRoot2==null) {
			return true;
		}
		if(pRoot1==null||pRoot2==null) {
			return false;
		}
		if(pRoot1.val!=pRoot2.val) {
			return false;
		}
		return isSymmetrical(pRoot1.left,pRoot2.right)&&isSymmetrical(pRoot1.right,pRoot2.left);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TreeNode node1=new TreeNode(1);
          TreeNode node2=new TreeNode(2);
          TreeNode node3=new TreeNode(3);
          TreeNode node4=new TreeNode(4);
          TreeNode node5=new TreeNode(5);
          TreeNode node6=new TreeNode(6);
          TreeNode node7=new TreeNode(7);
          node1.left=node2;
          node1.right=node3;
          node2.left=node4;
          node2.right=node5;
          node3.left=node6;
          node3.right=node7;

          
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