package ����������һ���ڵ�_8;

public class Solution {
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		//�ýڵ�����������
		//1.�У�����һ�ڵ������������������ڵ�
		if(pNode.right!=null) {
			pNode=pNode.right;
			while(pNode.left!=null) {
				pNode=pNode.left;
			}
			return pNode;
		}
		//2.��
		else {
			//�ýڵ�Ϊ���ڵ㣬��û�и��ڵ�
			if(pNode.next==null) {
				return null;
			}
			//�ýڵ�Ϊ�丸����ڵ㣬������һ�ڵ�����丸
			if(pNode.next.left==pNode) {
				return pNode.next;
			}
			//�ýڵ�Ϊ�丸���ҽڵ㣬 ��һֱ���ϱ������ڵ㣬ֱ���ø����丸����return�丸
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