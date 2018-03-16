package �ַ���������_38;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * �ֵ�����
 */

public class Solution {
	public ArrayList<String> Permutation(String str) {
		
		ArrayList<String> result=new ArrayList<>();
		
		//���ַ���תΪ�ַ����飬Ȼ������
		if(str==null||str.length()==0)
			return result;
		char[] charstr=str.toCharArray();
		Arrays.sort(charstr);//����-���򣬵õ���С��
		result.add(String.valueOf(charstr));		
		
		//ֹͣ�����������������ڶ���С�����ڣ��������
		while(!isMax(charstr)) {
			int i; //��¼���������ҵ���һ������С�����ڵ�����m����λ��
			int j; //��¼���ҵ����һ����m�������n����λ��
			//�Ӵ��������ҵ���һ������С�����ڵ���

			for(int p=charstr.length-1;p>0;p--) {
				if(charstr[p]>charstr[p-1]) {
					i=p-1;
					for(int q=charstr.length-1;q>i;q--) {
						if(charstr[q]>charstr[i])
						{
							j=q;
							//����m��n
							change(charstr,i,j);
							//��i+1�����һ��Ԫ�ش�С��������
							Arrays.sort(charstr, i+1, charstr.length);
							//������
							result.add(String.valueOf(charstr));
							break;
						}
					}					
					break;
				}
			}
		}
		return result;
		
	}
	
	//�жϣ������������ڶ���С�����ڣ��������
	public static boolean isMax(char[] charstr) {
		for(int i=charstr.length-1;i>0;i--) {
			//����С������
			if(charstr[i-1]<charstr[i])
				return false;
		}
		return true;
	}
	
	//����char[i]char[j]
	public static void change(char[] charstr,int i,int j) {
		char temp=charstr[i];
		charstr[i]=charstr[j];
		charstr[j]=temp;
	}
	     
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		ArrayList<String> result=s.Permutation("321");
		System.out.println(result);

	}

}
