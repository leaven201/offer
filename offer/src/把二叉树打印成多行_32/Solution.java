package 把二叉树打印成多行_32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot){
		ArrayList<ArrayList<Integer>> list=new ArrayList();
		if(pRoot==null) {
			return list;
		}
		//定义一个队列
		Queue<TreeNode> queue=new LinkedList();
		queue.offer(pRoot);
		//记录当前层有多少个节点
		int nowSum=1;
		
		while(!queue.isEmpty()) {
			//定义一个list1存放当前层需要打印的节点；
			ArrayList<Integer> list1 = new ArrayList();
			//定义nextSum记录下一层有多少个节点
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