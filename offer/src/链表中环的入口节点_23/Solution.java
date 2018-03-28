package 链表中环的入口节点_23;

public class Solution {
	public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        int sum=nodeSumOfCircle(pHead);
        return returnNode(pHead,sum);
        
    }
    public int nodeSumOfCircle(ListNode pHead){
        int sum=0;
        ListNode node1=pHead;
        ListNode node2=pHead.next;
        while(node2!=null&&node1.val!=node2.val&&node2.next!=null){
            node1=node1.next;
            node2=node2.next.next;
        }
        if(node2!=null){
            node2=node2.next;
            sum++;
            while(node2.val!=node1.val){
                node2=node2.next;
                sum++;
            }
        }
        return sum;
    }
    public ListNode returnNode (ListNode pHead,int sum){
        if(sum==0){
            return null;
        }
        ListNode node1=pHead;
        ListNode node2=pHead;
        while(sum!=0){
            node2=node2.next;
            sum--;
        }
        while(node1!=node2){
            node1=node1.next;
            node2=node2.next;
        }
        return node1;
    }
    
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
