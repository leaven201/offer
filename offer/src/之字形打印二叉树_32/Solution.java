package 之字形打印二叉树_32;

import java.util.Stack;

public class Solution {
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot){
		//定义两个栈
		Stack<TreeNode> stack1=new Stack<>();
		Stack<TreeNode> stack2=new Stack<>();
		//层数，判断怎么入栈    奇数：先left后right    偶数先right后left
		int floor=0;
		stack1.add(pRoot);
		while(stack1.size()!=0||stack2.size()!=0) {
			floor++;
			//奇数
			if((floor&1)==1) {
				while()
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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