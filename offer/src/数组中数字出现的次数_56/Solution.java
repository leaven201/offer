package ���������ֳ��ֵĴ���_56;


public class Solution {
	public int GetNumberOfK(int[] array, int k) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == k)
				count++;
		}
		return count;
	}
	
	/*
	 * ��Ŀһ��������ֻ����һ�ε���������
	 * ��������ֻ����1�Σ�����������2��
	 */
	public int[] FindNumsAppearOnce(int[] array) {
		int[] nums=new int[2];
		if(array==null||array.length<2)
			return null;
		int resultExclusiveOR=0;
		//�������������ֽ������������õ����������Ϊ����ֻ����һ�ε��������Ľ�������������ε����־�����������Ϊ0��
		for(int i=0;i<array.length;i++) {
			resultExclusiveOR=resultExclusiveOR^array[i];
		}
		//�ҵ�resultExclusiveOR���ұߵ�һλΪ1��λ
		int indexOf1=FindFirstBitIs1(resultExclusiveOR);
		
		//���ݵ�indexOf1λ�ǲ���1��ԭ�����Ϊ���������飬����ÿ���������о�ֻ��һ�����ֳ���1��
		int x=1;
		while(indexOf1>1) {
			x=x<<1;
			indexOf1--;
		}
		
		for(int i=0;i<array.length;i++) {
			if(isBit1(array[i], x))
				nums[0]=nums[0]^array[i];
			if(!isBit1(array[i], x))
				nums[1]=nums[1]^array[i];
		}
		return nums;
	}
    //�жϵ�indexOf1λ�ǲ���1
	private boolean isBit1(int num, int x) {
		
		if((num&x)==0)
			return false;
		else
			return true;
	}

	private int FindFirstBitIs1(int resultExclusiveOR) {
		int indexBit=1;
		int num=1;
		while(((resultExclusiveOR&num)==0)&&(indexBit<Integer.toBinaryString(resultExclusiveOR).length())) {
			num=num<<1;
			indexBit++;
		}
		return indexBit;
	}
		
	
	/*
	 * ��Ŀ����������Ψһֻ����һ�ε�����
	 * һ�����ֳ���1�Σ�����������3��
	 */
	public int FindNumberAppearingOnce(int[] array) {
		//���������ֵ�ÿһλ���
		int[] bitSum=new int[32];
		for(int i=0;i<array.length;i++) {
			int bitMask=1;
			for(int j=31;j>=0;j--) {
				int bit=array[i]&bitMask;
				if(bit!=0)
					bitSum[j]+=1;
				bitMask=bitMask<<1;
			}
		}
		int result=0;
		for(int i=0;i<32;i++) {
			result=result<<1;
			result+=bitSum[i]%3;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array= {2,4,3,6,3,2,5,5};
		Solution solution=new Solution();
		int[] result=solution.FindNumsAppearOnce(array);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		int[] array1= {5,3,3,3,4,4,4,56,56,56,7,7,7,567,567,567};
		int result1=solution.FindNumberAppearingOnce(array1);
		System.out.println(result1);

	}

}
