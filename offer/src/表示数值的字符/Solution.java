package ��ʾ��ֵ���ַ�;

public class Solution {
	public boolean isNumeric(char[] str) {
		boolean firstSign=false;//��λ�Ƿ��Ƿ���λ
		int sign=0;//������
		int decimal=0;//.�ĸ���
		int hasE=0;//E�ĸ���
		
		
		if(str.length==0)
			return false;

		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
			
			//���ֳ�0-9����.����E/e������ַ�ֱ�ӷ���false
			if(str[i]!='.'&&str[i]!='E'&&str[i]!='e'&&(str[i]>'9'||str[i]<'0')&&str[i]!='+'&&str[i]!='-') {
				System.out.println(1);
				return false;
			}
			
			//   ./E/e���ܳ�������λ
			if(i==0&&(str[i]=='.'||str[i]=='E'||str[i]=='e')) {
				System.out.println(2);
				return false;
			}
			
			//�����λ��+/-
			if(i==0&&(str[i]=='+'||str[i]=='-')){
				firstSign=true;
				sign++;
				//E/e���ܸ��ڵ�һ������λ����
				if(1<str.length&&(str[1]=='E'||str[1]=='e')) {
					System.out.println(3);
					return false;
				}
			}
			//�������λ���ǳ�������λ����ǰ��һ��Ҫ��E/e
			if(i!=0&&(str[i]=='+'||str[i]=='-')) {
				sign++;
				//����������2 ����false
				if(sign>2) {
					System.out.println(4);
					return false;
				}
				if(str[i-1]!='E'&&str[i-1]!='e') {
					System.out.println(5);
					return false;
				}
			}
			//����E/e����ʱ�Ѿ��ų���E/e��������λ�����ڵڶ�λ��ǰ��λ���ŵ����
			if(str[i]=='E'||str[i]=='e') {
				hasE++;
				if(hasE++>1) {
					System.out.println(6);
					return false;
				}
				//E/e���������һλ������false
				if(i==str.length-1) {
					System.out.println(7);
					return false;
				}
//				if(str[i+1]=='.'||str[i+1]=='+'||str[i+1]=='-') {
//					System.out.println(8);
//					return false;
//				}
			}
			//����.ǰ�����Ҫ�������Һ���ҲҪ�����֣���ֻ�ܳ���һ�Σ��Ҳ����Գ�����E/e����
			if(str[i]=='.') {
				decimal++;
				//���ֶ���1�εġ�
				if(decimal>1) {
					System.out.println(9);
					return false;
				}
				
				//���ǰ�����E/e��return false
				if(hasE>0) {
					System.out.println(10);
					return false;
				}
				//.���ܳ��������һλ
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
