package test1;

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		int sum1=n/5;
		int x=1;
		while(Math.pow(5, x)<=n) {
			x++;
		}
		x=x-1;
		int sum2=(x*x-x)/2;
		int sum=sum1+sum2;
		
		System.out.println(sum1);
		System.out.println(sum2);
		
		System.out.println(sum);

	}

}
