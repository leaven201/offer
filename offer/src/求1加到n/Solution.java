package ��1�ӵ�n;

public class Solution {
	//�����߼���Ķ�·����ʵ�ֵݹ���ֹ��
	public int Sum_Solution(int n) {
		int sum=n ;
		boolean ans= (n>0)&&(sum=sum+Sum_Solution(n-1))>0;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		System.out.println(s.Sum_Solution(5));
	}

}
