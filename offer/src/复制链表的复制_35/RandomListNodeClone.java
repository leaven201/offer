package ��������ĸ���_35;

public class RandomListNodeClone {
	public RandomListNode Clone(RandomListNode pHead) {
		
		if(pHead==null)
			return null;
		
		RandomListNode pCur=pHead;
		
		//��һ������list�������Ƶ�N���嵽N����    A-B-C-D-E   A-A'-B-B'-C-C'-D-D'-E-E'
		while(pCur!=null) {
			//����һ��pCur
			RandomListNode pCur_clone=new RandomListNode(pCur.label);
			//��pCur_clone���뵽pCur����
			pCur_clone.next=pCur.next;
			pCur.next=pCur_clone;
			pCur=pCur_clone.next;
		}
		
		 pCur = pHead;
		
		 //�ڶ���������random pCur��ԭ������Ľ�� pCur.next�Ǹ���pCur�Ľ��
		while(pCur!=null) {
			//���pCur��random����ָ��null����pCur.next��randomָ��pCur.random.next
			if(pCur.random!=null) {
				pCur.next.random=pCur.random.next;
			}
			pCur=pCur.next.next;
		}
		//���������������
        
		RandomListNode head = pHead.next;//�渴�ƺ�ı�ĵ�һ��
		RandomListNode cur = head;//�����޸ĸ��ƺ���ָ��
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