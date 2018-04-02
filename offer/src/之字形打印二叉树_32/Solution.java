package ֮���δ�ӡ������_32;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot){
		//����һ��List���������
		ArrayList<ArrayList<Integer>> list=new ArrayList();
		if(pRoot==null) {
			return list;
		}
		//��������ջ
		Stack<TreeNode> stack1=new Stack<>();   //stack1�����ȴ���ڵ��ٴ��ҽڵ�
		stack1.push(pRoot);
		Stack<TreeNode> stack2=new Stack<>();   //Stack2�����ȴ��ҽڵ��ٴ���ڵ�
		
		while(!stack1.isEmpty()||!stack2.isEmpty()) {
			if(!stack1.isEmpty()) {
				ArrayList<Integer> list1=new ArrayList();
				while(!stack1.isEmpty()) {
					TreeNode node=stack1.pop();
					list1.add(node.val);
					if(node.left!=null) {
						stack2.push(node.left);
					}
					if(node.right!=null) {
						stack2.push(node.right);
					}
				}
				list.add(list1);
			}
			else {
				ArrayList<Integer> list2=new ArrayList();
				while(!stack2.isEmpty()) {
					TreeNode node=stack2.pop();
					list2.add(node.val);
					if(node.right!=null) {
						stack1.push(node.right);
					}
					if(node.left!=null) {
						stack1.push(node.left);
					}
				}
				list.add(list2);
			}
		}
		return list;
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