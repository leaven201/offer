package ֮���δ�ӡ������_32;

import java.util.Stack;

public class Solution {
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot){
		//��������ջ
		Stack<TreeNode> stack1=new Stack<>();
		Stack<TreeNode> stack2=new Stack<>();
		//�������ж���ô��ջ    ��������left��right    ż����right��left
		int floor=0;
		stack1.add(pRoot);
		while(stack1.size()!=0||stack2.size()!=0) {
			floor++;
			//����
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