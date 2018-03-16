package 圆圈中最后剩下的数字_62;

import java.util.LinkedList;

public class Solution {
	public int LastRemaining_Solution(int n, int m) {
		//利用递推关系式
		//F（1，m）=0
		//F（n，m）=[F（n-1，m）+m]%n
		
		if(n<=0)
			return -1;
		if(n==1)
			return 0;
		return (LastRemaining_Solution(n-1,m)+m)%n;
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		int remain=s.LastRemaining_Solution(5, 3);
		System.out.println(remain);

	}

}
