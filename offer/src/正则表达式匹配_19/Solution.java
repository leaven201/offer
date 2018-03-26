package 正则表达式匹配_19;

public class Solution {
	 public boolean match(char[] str, char[] pattern) {
		 if(str==null||pattern==null)
			 return false;
		 int strIndex=0;
		 int patternIndex=0;
		 return matchCore(str, strIndex, pattern, patternIndex);
	 }
	 /*
	  *情况1：模式中第二个不是“*”   1、匹配，字符串与模式都后移一位      2、不匹配，返回false
	  *
	  *情况2：模式中第二个是“*”     “*”可以使前一个字符出现任意次
	  *（1）字符串与模式不匹配  则模式后移2位
	  *（2）字符串与模式匹配     2.1模式后移2位(*=0)
	  *                  2.2字符串后移1位模式不变（*>1）
	  *                  2.3字符串后移1位模式后移2位（*=1）
	  */
	 public boolean matchCore(char[] str,int strIndex,char[] pattern,int patternIndex) {
		 //有效性检验；str到尾，pattern到尾说明匹配成功
		 if(strIndex==str.length&&patternIndex==pattern.length) {
			 return true;
		 }
		 
		 //pattern先到尾，匹配失败
		 if(strIndex!=str.length&&patternIndex==pattern.length) {
			 return false;
		 }

		 //模式中第二个是“*”
		  //（1）字符串与模式不匹配  则模式后移2位
		  //（2）字符串与模式匹配     2.1模式后移2位(*=0)
		  //                  2.2字符串后移1位模式不变（*>1）
		  //                  2.3字符串后移1位模式后移2位（*=1）
		 if(patternIndex+1<pattern.length&&pattern[patternIndex+1]=='*') {
			//（2）字符串与模式匹配
			 if((strIndex!=str.length&&str[strIndex]==pattern[patternIndex])||(pattern[patternIndex] == '.' && strIndex != str.length)) {
				 return matchCore(str, strIndex, pattern, patternIndex+2)       //2.1模式后移2位(*=0)     
						 ||matchCore(str, strIndex+1, pattern, patternIndex)    //2.2字符串后移1位模式不变（*>1）
						 ||matchCore(str, strIndex+1, pattern, patternIndex+2); //2.3字符串后移1位模式后移2位（*=1）
			 }
			 //（1）字符串与模式不匹配  则模式后移2位
			 else {
				 return matchCore(str, strIndex, pattern, patternIndex+2);
			 }			   
		 }
		//模式中第二个不是“*”   1、匹配，字符串与模式都后移一位      2、不匹配，返回false
		if((strIndex!=str.length&&str[strIndex]==pattern[patternIndex])||(pattern[patternIndex] == '.' && strIndex != str.length)) {
				 return matchCore(str, strIndex+1, pattern, patternIndex+1);
		}
		return false;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          char[] str= {'a','a','a'};
//          char[] pattern= {'a','b','*','a','c','*','a'};
          
        Solution s=new Solution();
        char[] str= {};
		char[] pattern={'.'};
	 	boolean res=s.match(str, pattern);
        System.out.println(res);
	}

}
