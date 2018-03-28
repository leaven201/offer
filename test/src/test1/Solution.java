package test1;

public class Solution {
	public int LastRemaining_Solution(int n, int m) {
		if(n<=0)
			return -1;
		if(n==1)
			return 0;
		return (LastRemaining_Solution(n-1, m)+m)%n;				
	}
	public int Sum_Solution(int n) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		System.out.println(s.LastRemaining_Solution(5, 3));


	}

}
