package �ַ����е�һ�����ظ����ַ�_50;

public class Solution {
	
	//��¼ÿ���ַ����ֵĴ���
	int[] table=new int[256];
	StringBuffer s=new StringBuffer();

	public void Insert(char ch) {
		s.append(ch);
		if(table[ch]==0) {
			table[ch]=1;
		}
		else {
			table[ch]=table[ch]+1;
		}
	}
	
	public char FirstAppearingOnce() {
		char[] str=s.toString().toCharArray();
		for(char c:str) {
			if(table[c]==1)
				return c;
		}
		return '#';
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
