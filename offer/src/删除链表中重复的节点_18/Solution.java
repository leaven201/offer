package 删除链表中重复的节点_18;

public class Solution {
	 
	 
	public ListNode deleteDuplication(ListNode pHead) {
		ListNode n=new ListNode(0);
		n.next=pHead;
		ListNode currentNode=pHead;
		ListNode preNode=n;
		
		while(currentNode!=null) {
			ListNode nextNode=currentNode.next;
			if(nextNode==null)
				break;
			if(nextNode.val==currentNode.val) {
				while(nextNode!=null&&nextNode.val==currentNode.val) {
					nextNode=nextNode.next;
				}
				preNode.next=nextNode;
				currentNode=nextNode;
			}
			else {
				preNode=currentNode;
				currentNode=nextNode;				
			}
		}
		return n.next;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(1);
//		ListNode n3=new ListNode(3);
//		ListNode n4=new ListNode(3);
//		ListNode n5=new ListNode(4);
//		ListNode n6=new ListNode(4);
//		ListNode n7=new ListNode(5);
		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		n4.next=n5;
//		n5.next=n6;
//		n6.next=n7;
		
		Solution s= new Solution();
		ListNode res=s.deleteDuplication(n1);
		
		while(res!=null) {
			System.out.println(res.val);
			res=res.next;
		}

		
		
		
		
		
		

	}

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
