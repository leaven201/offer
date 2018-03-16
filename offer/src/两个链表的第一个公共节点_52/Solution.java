package 两个链表的第一个公共节点_52;

public class Solution {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode common=null;
		int List1Length = 0;
		ListNode p1=pHead1;
		while(p1!=null) {
			p1=p1.next;
			List1Length++;
		}
		System.out.println(List1Length);
		int List2Length=0;
		ListNode p2=pHead2;
		while(p2!=null) {
			p2=p2.next;
			List2Length++;
		}
		System.out.println(List2Length);

		int diff=List1Length-List2Length;
		int step=Math.abs(diff);
		System.out.println(step);
		if(diff>=0) {
			int s=0;
			while(s!=step) {
				pHead1=pHead1.next;
				s++;
			}
		}
		if(diff<0) {
			int s=0;
			while(s!=step) {
				pHead2=pHead2.next;
				s++;
			}
		}
		while(pHead1!=null&&pHead2!=null) {
			if(pHead1.val==pHead2.val) {
				common=pHead1;
				break;
			}
			pHead1=pHead1.next;
			pHead2=pHead2.next;
		}
		return common;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
		ListNode node6=new ListNode(6);
		ListNode node7=new ListNode(7);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node6;
		node6.next=node7;
		node4.next=node5;
		node5.next=node6;
		
		Solution s=new Solution();
		ListNode common=s.FindFirstCommonNode(node1, node4);
		System.out.println(common.val);



		

	}

}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}