package test;



public class Test {
	public static int test(int n,int k) {
		
		int sum=0;
		int sum2=(int) (0.5*(n-k)*(n-k+1));
		if(sum2<0) {
			sum2=0;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				if((i%j)>=k) {
					sum++;
				}
			}
		}
		return sum+sum2;
		
	}
	public static int test2(int n,int k) {
		int sum1=(int) (0.5*(n-k)*(n-k+1));
		int sum2=0;
		
		for(int i=k+1;i<=n;i++) {
			//每次循环中大于k的数
			int big=i-k;
			//循环数
			int circle=(n-i+1)/i;
			int sum=big*circle;
			
			sum2=sum2+sum;
			
			
			if((n-i+1)%i>=k+1)
				sum2=sum2+((n-i+1)%i-k);
		}
		return sum2+sum1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(test(55,7));
		System.out.println(test2(55,7));


	}

}
