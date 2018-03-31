package 二叉树的下一个节点_8;

public class Solution {
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		//该节点有无右子树
		//1.有，则下一节点就是其右子树的最左节点
		if(pNode.right!=null) {
			pNode=pNode.right;
			while(pNode.left!=null) {
				pNode=pNode.left;
			}
			return pNode;
		}
		//2.无
		else {
			//该节点为根节点，及没有父节点
			if(pNode.next==null) {
				return null;
			}
			//该节点为其父的左节点，则其下一节点就是其父
			if(pNode.next.left==pNode) {
				return pNode.next;
			}
			//该节点为其父的右节点， 则一直往上遍历父节点，直到该父是其父的左，return其父
			if(pNode.next.right==pNode) {
				while(pNode.next!=null) {
					pNode=pNode.next;
					if(pNode.next==null)
						return null;
					else {
						if(pNode.next.left==pNode) {
							return pNode.next;
						}
					}
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}