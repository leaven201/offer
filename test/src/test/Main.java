package test;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int res=0;
        res=find(k,n);
        System.out.println(res);
    }
    public static int find (int k,int n){
        if(k<0||n<1||k>n) return 0;
        int res=0;
        
        for(int i=k+1;i<n-1;i++) {
        	for(int j=n;j>=i+k;j--) {
        		if(j%i>=k) {
        			res++;
        		}
        	}
        }
        
        for(int i=n-k;i>=0;i--) {
        	res=res+i;
        }
        return res;
    }
}
