package �˿���˳��_61;

import java.util.Arrays;

public class Solution {

	public boolean isContinuous(int[] numbers) {
		/*
		 * ˳�ӵ�����1�����ظ�
		 * flag���Ա���Ƿ��ظ�������3��5��flag���Ϊ101000���ٴγ鵽3ʱ����3��Ϊ101��1Ϊ1��˵�����ظ�
		 */
		if(numbers.length!=5)
			return false;
		int max=-1;//�˿��Ƶķ�Χ1-13
		int min=14;
		int flag=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==0)
				continue;
			if(((flag>>numbers[i])&1)==1)
				return false;
			flag=((1<<numbers[i])|flag);
			//�ҳ��������ֵ
			if(numbers[i]>max)
				max=numbers[i];
			//�ҳ�������Сֵ
			if(numbers[i]<min)
				min=numbers[i];				
			//˳�ӵ�����2����������������С��С��5
			if((max-min)>4)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] numbers = { 3, 4, 5, 0, 0 };
		System.out.println(s.isContinuous(numbers));


	}

}
