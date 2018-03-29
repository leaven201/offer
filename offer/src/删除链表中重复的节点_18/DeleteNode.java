package 删除链表中重复的节点_18;

public class DeleteNode {
	public void DeleteNode(ListNode pHead,ListNode deleteNode) {
		if(pHead==null||deleteNode==null)
			return;
		//要删除的节点不是尾节点
		if(deleteNode.next!=null) {
			ListNode pNext=deleteNode.next;
			deleteNode.val=pNext.val;
			deleteNode.next=pNext.next;
		}
		
		//链表只有一个节点，删除头节点（也是尾节点）
		else if(pHead==deleteNode) {
			pHead=null;
		}
		//链表中有多个节点，删除尾节点
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
