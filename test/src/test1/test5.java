package test1;

import java.util.Arrays;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		for (int i = 0; i < 3; i++) {
			int b = scanner.nextInt();
			a[i] = b;
		}
		int hight=a[0];
		int chairHight=a[1];
		int totalhight=hight+chairHight;
		int applesSum=a[2];
		int[] apples=new int[applesSum];
		for(int i=0;i<applesSum;i++) {
			int r=scanner.nextInt();
			apples[i]=r;
		}
		int sum=0;
		for(int i=0;i<applesSum;i++) {
			if(apples[i]<totalhight)
				sum++;
		}
		System.out.println(sum);
		
	}

}
