package ���üӼ��˳����ӷ�_65;

public class Solution {
	
public int Add(int num1,int num2) {
    while(num2!=0) {
    	int temp=num1^num2;   //��λ��Ӳ���λ�����õ��µ�num1��
    	num2=(num1&num2)<<1;  //�����λֵ����������������һλ���õ��µ�num2����num2=0000000ʱ˵��û�н�λ�ˣ���ʱ�����temp��������ֵ
    	num1=temp;
    }
	return num1;
	
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Solution s=new Solution();
          System.out.println(s.Add(45,233));
	}

}
