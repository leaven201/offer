package 复制链表的复制_35;

public class RandomListNodeClone {
	public RandomListNode Clone(RandomListNode pHead) {
		
		if(pHead==null)
			return null;
		
		RandomListNode pCur=pHead;
		
		//第一步复制list，将复制的N’插到N后面    A-B-C-D-E   A-A'-B-B'-C-C'-D-D'-E-E'
		while(pCur!=null) {
			//复制一个pCur
			RandomListNode pCur_clone=new RandomListNode(pCur.label);
			//将pCur_clone插入到pCur后面
			pCur_clone.next=pCur.next;
			pCur.next=pCur_clone;
			pCur=pCur_clone.next;
		}
		
		 pCur = pHead;
		
		 //第二步：复制random pCur是原来链表的结点 pCur.next是复制pCur的结点
		while(pCur!=null) {
			//如果pCur的random不是指向null；则将pCur.next的random指向pCur.random.next
			if(pCur.random!=null) {
				pCur.next.random=pCur.random.next;
			}
			pCur=pCur.next.next;
		}
		//第三步：拆分链表
        
		RandomListNode head = pHead.next;//存复制后的表的第一个
		RandomListNode cur = head;//用于修改复制后表的指针
		pCur = pHead;
		
		 while(pCur!=null){
	            pCur.next = pCur.next.next;
	            if(cur.next!=null)
	                cur.next = cur.next.next;
	            cur = cur.next;
	            pCur = pCur.next;
	        }
	        return head;    	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomListNode A=new RandomListNode(1);
		RandomListNode B=new RandomListNode(2);
		RandomListNode C=new RandomListNode(3);
		RandomListNode D=new RandomListNode(4);
		RandomListNode E=new RandomListNode(5);
		A.next=B;
		B.next=C;
		C.next=D;
		D.next=E;
		A.random=C;
		B.random=E;
		D.random=B;
		
		RandomListNodeClone s=new RandomListNodeClone();
		RandomListNode copy=s.Clone(A);
		while(copy!=null) {
			System.out.println(copy.label+" random:"+copy.random);
			copy=copy.next;
		}

	}

}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}