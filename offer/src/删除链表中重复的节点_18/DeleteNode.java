package ɾ���������ظ��Ľڵ�_18;

public class DeleteNode {
	public void DeleteNode(ListNode pHead,ListNode deleteNode) {
		if(pHead==null||deleteNode==null)
			return;
		//Ҫɾ���Ľڵ㲻��β�ڵ�
		if(deleteNode.next!=null) {
			ListNode pNext=deleteNode.next;
			deleteNode.val=pNext.val;
			deleteNode.next=pNext.next;
		}
		
		//����ֻ��һ���ڵ㣬ɾ��ͷ�ڵ㣨Ҳ��β�ڵ㣩
		else if(pHead==deleteNode) {
			pHead=null;
		}
		//�������ж���ڵ㣬ɾ��β�ڵ�
		else {
			ListNode pNode=pHead;
			while(pNode.next!=deleteNode){
				pNode=pNode.next;
			}
			pNode.next=null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
