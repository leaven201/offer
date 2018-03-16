package 求1加到n;

public class Solution {
	//利用逻辑与的短路特性实现递归终止。
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
