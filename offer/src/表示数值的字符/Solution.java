package 表示数值的字符;

public class Solution {
	public boolean isNumeric(char[] str) {
		boolean firstSign=false;//首位是否是符号位
		int sign=0;//符号数
		int decimal=0;//.的个数
		int hasE=0;//E的个数
		
		
		if(str.length==0)
			return false;

		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
			
			//出现除0-9，“.”，E/e以外的字符直接返回false
			if(str[i]!='.'&&str[i]!='E'&&str[i]!='e'&&(str[i]>'9'||str[i]<'0')&&str[i]!='+'&&str[i]!='-') {
				System.out.println(1);
				return false;
			}
			
			//   ./E/e不能出现在首位
			if(i==0&&(str[i]=='.'||str[i]=='E'||str[i]=='e')) {
				System.out.println(2);
				return false;
			}
			
			//如果首位是+/-
			if(i==0&&(str[i]=='+'||str[i]=='-')){
				firstSign=true;
				sign++;
				//E/e不能跟在第一个符号位后面
				if(1<str.length&&(str[1]=='E'||str[1]=='e')) {
					System.out.println(3);
					return false;
				}
			}
			//如果符号位不是出现在首位则它前面一定要跟E/e
			if(i!=0&&(str[i]=='+'||str[i]=='-')) {
				sign++;
				//符号数大于2 返回false
				if(sign>2) {
					System.out.println(4);
					return false;
				}
				if(str[i-1]!='E'&&str[i-1]!='e') {
					System.out.println(5);
					return false;
				}
			}
			//出现E/e，此时已经排除了E/e出现在首位或者在第二位且前面位符号的情况
			if(str[i]=='E'||str[i]=='e') {
				hasE++;
				if(hasE++>1) {
					System.out.println(6);
					return false;
				}
				//E/e出现在最后一位，返回false
				if(i==str.length-1) {
					System.out.println(7);
					return false;
				}
//				if(str[i+1]=='.'||str[i+1]=='+'||str[i+1]=='-') {
//					System.out.println(8);
//					return false;
//				}
			}
			//出现.前面必须要有数字且后面也要后数字，且只能出现一次，且不可以出现再E/e后面
			if(str[i]=='.') {
				decimal++;
				//出现多余1次的。
				if(decimal>1) {
					System.out.println(9);
					return false;
				}
				
				//如果前面出现E/e，return false
				if(hasE>0) {
					System.out.println(10);
					return false;
				}
				//.不能出现再最后一位
				if(i==str.length-1) {
					System.out.println(11);
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         char[] str= {'-','.','1','2','3'};
         Solution s= new Solution();
         boolean res=s.isNumeric(str);
         System.out.println(res);
	}

}
