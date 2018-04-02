package �Ѷ�������ӡ�ɶ���_32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot){
		ArrayList<ArrayList<Integer>> list=new ArrayList();
		if(pRoot==null) {
			return list;
		}
		//����һ������
		Queue<TreeNode> queue=new LinkedList();
		queue.offer(pRoot);
		//��¼��ǰ���ж��ٸ��ڵ�
		int nowSum=1;
		
		while(!queue.isEmpty()) {
			//����һ��list1��ŵ�ǰ����Ҫ��ӡ�Ľڵ㣻
			ArrayList<Integer> list1 = new ArrayList();
			//����nextSum��¼��һ���ж��ٸ��ڵ�
			int nextSum=0;
			while(nowSum!=0) {
				TreeNode node = queue.poll();
				list1.add(node.val);
				nowSum--;
				if(node.left!=null) {
					queue.offer(node.left);
					nextSum++;
				}
				if(node.right!=null) {
					queue.offer(node.right);
					nextSum++;
				}
			}
			list.add(list1);
			nowSum=nextSum;
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