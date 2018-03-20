package �����˻�����_66;

public class Solution {
	
	public int[] multiply(int[] A) {
		 int[] result=new int[A.length];
		 //����C[i]D[i]����    C[i]=C[i-1]*A[i-1] C[0]=1;    i��1��n-1
		 //                D[i]=D[i+1]*A[i+1] D[n-1]=1  i��n-2��0
		 int[] C=new int[A.length];
		 int[] D=new int[A.length];
		 
		 C[0]=1;
		 for(int i=1;i<A.length;i++) {
			 C[i]=C[i-1]*A[i-1];
		 }
		 
		 D[A.length-1]=1;
		 for(int i=A.length-2;i>=0;i--) {
			 D[i]=D[i+1]*A[i+1];
		 }
		 for(int i=0;i<A.length;i++) {
			 result[i]=C[i]*D[i];
		 }
		 return result;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
