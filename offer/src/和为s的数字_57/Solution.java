package 和为s的数字_57;

public class Solution {
	int[] result=new int[2];
	public boolean FindNumbersWithSum(int data[],int sum) {
		boolean isFound=false;
		int small=0;
		int big=data.length-1;
		while(isFound==false&&small<big) {
			if((data[small]+data[big])==sum) {
				isFound=true;
				result[0]=data[small];
				result[1]=data[big];
			}
			else if((data[small]+data[big])<sum) {
				small++;
			}
			else if((data[small]+data[big])>sum) {
				big--;
			}
		}
		return isFound;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		int[] data= {1,2,4,7,11,15};
		System.out.println(s.FindNumbersWithSum(data, 30));
		System.out.println(s.result[0]);
		System.out.println(s.result[1]);
		

	}

}
