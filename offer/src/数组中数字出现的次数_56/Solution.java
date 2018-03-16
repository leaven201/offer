package 数组中数字出现的次数_56;


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
	 * 题目一：数组中只出现一次的两个数字
	 * 两个数字只出现1次，其他都出现2次
	 */
	public int[] FindNumsAppearOnce(int[] array) {
		int[] nums=new int[2];
		if(array==null||array.length<2)
			return null;
		int resultExclusiveOR=0;
		//将数组所有数字进行异或操作，得到的最后数即为两个只出现一次的数字异或的结果。（出现两次的数字经过异或操作变为0）
		for(int i=0;i<array.length;i++) {
			resultExclusiveOR=resultExclusiveOR^array[i];
		}
		//找到resultExclusiveOR中右边第一位为1的位
		int indexOf1=FindFirstBitIs1(resultExclusiveOR);
		
		//根据第indexOf1位是不是1将原数组分为两个子数组，这样每个子数组中就只有一个数字出现1次
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
    //判断第indexOf1位是不是1
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
	 * 题目二：数组中唯一只出现一次的数字
	 * 一个数字出现1次，其他都出现3次
	 */
	public int FindNumberAppearingOnce(int[] array) {
		//将所有数字的每一位相加
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
