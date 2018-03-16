package 不用加减乘除做加法_65;

public class Solution {
	
public int Add(int num1,int num2) {
    while(num2!=0) {
    	int temp=num1^num2;   //各位相加不进位，（得到新的num1）
    	num2=(num1&num2)<<1;  //计算进位值，先与运算再左移一位（得到新的num2）当num2=0000000时说明没有进位了，此时算出的temp就是最终值
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
