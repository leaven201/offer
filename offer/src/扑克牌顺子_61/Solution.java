package 扑克牌顺子_61;

import java.util.Arrays;

public class Solution {

	public boolean isContinuous(int[] numbers) {
		/*
		 * 顺子的条件1：不重复
		 * flag用以标记是否重复，假设3、5则flag会变为101000，再次抽到3时右移3变为101与1为1，说明有重复
		 */
		if(numbers.length!=5)
			return false;
		int max=-1;//扑克牌的范围1-13
		int min=14;
		int flag=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==0)
				continue;
			if(((flag>>numbers[i])&1)==1)
				return false;
			flag=((1<<numbers[i])|flag);
			//找出非零最大值
			if(numbers[i]>max)
				max=numbers[i];
			//找出非零最小值
			if(numbers[i]<min)
				min=numbers[i];				
			//顺子的条件2：必须满足最大减最小，小于5
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
