package ������ʽƥ��_19;

public class Solution {
	 public boolean match(char[] str, char[] pattern) {
		 if(str==null||pattern==null)
			 return false;
		 int strIndex=0;
		 int patternIndex=0;
		 return matchCore(str, strIndex, pattern, patternIndex);
	 }
	 /*
	  *���1��ģʽ�еڶ������ǡ�*��   1��ƥ�䣬�ַ�����ģʽ������һλ      2����ƥ�䣬����false
	  *
	  *���2��ģʽ�еڶ����ǡ�*��     ��*������ʹǰһ���ַ����������
	  *��1���ַ�����ģʽ��ƥ��  ��ģʽ����2λ
	  *��2���ַ�����ģʽƥ��     2.1ģʽ����2λ(*=0)
	  *                  2.2�ַ�������1λģʽ���䣨*>1��
	  *                  2.3�ַ�������1λģʽ����2λ��*=1��
	  */
	 public boolean matchCore(char[] str,int strIndex,char[] pattern,int patternIndex) {
		 //��Ч�Լ��飻str��β��pattern��β˵��ƥ��ɹ�
		 if(strIndex==str.length&&patternIndex==pattern.length) {
			 return true;
		 }
		 
		 //pattern�ȵ�β��ƥ��ʧ��
		 if(strIndex!=str.length&&patternIndex==pattern.length) {
			 return false;
		 }

		 //ģʽ�еڶ����ǡ�*��
		  //��1���ַ�����ģʽ��ƥ��  ��ģʽ����2λ
		  //��2���ַ�����ģʽƥ��     2.1ģʽ����2λ(*=0)
		  //                  2.2�ַ�������1λģʽ���䣨*>1��
		  //                  2.3�ַ�������1λģʽ����2λ��*=1��
		 if(patternIndex+1<pattern.length&&pattern[patternIndex+1]=='*') {
			//��2���ַ�����ģʽƥ��
			 if((strIndex!=str.length&&str[strIndex]==pattern[patternIndex])||(pattern[patternIndex] == '.' && strIndex != str.length)) {
				 return matchCore(str, strIndex, pattern, patternIndex+2)       //2.1ģʽ����2λ(*=0)     
						 ||matchCore(str, strIndex+1, pattern, patternIndex)    //2.2�ַ�������1λģʽ���䣨*>1��
						 ||matchCore(str, strIndex+1, pattern, patternIndex+2); //2.3�ַ�������1λģʽ����2λ��*=1��
			 }
			 //��1���ַ�����ģʽ��ƥ��  ��ģʽ����2λ
			 else {
				 return matchCore(str, strIndex, pattern, patternIndex+2);
			 }			   
		 }
		//ģʽ�еڶ������ǡ�*��   1��ƥ�䣬�ַ�����ģʽ������һλ      2����ƥ�䣬����false
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
