package 正则表达式匹配_19;

public class Solution {
	 public boolean match(char[] str, char[] pattern) {
		 if(str==null||pattern==null)
			 return false;
		 int strIndex=0;
		 int patternIndex=0;
		 return matchCore(str, strIndex, pattern, patternIndex);
	 }
	 
	 public boolean matchCore(char[] str,int strIndex,char[] pattern,int patternIndex) {
		 /*
		  *情况1：模式中第二个不是“*”   1、匹配，字符串与模式都后移一位      2、bu'pi
		  */
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
