package 字符流中第一个不重复的字符_50;

public class Solution {
	
	//记录每个字符出现的次数
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
