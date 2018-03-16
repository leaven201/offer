package ·­×ª×Ö·û´®_58;

public class Solution {
	 public String LeftRotateString(String str,int n) {
	        if(str.equals(""))
				return "";	
			int strLength=str.length();
			int moveN=n%strLength;
			String str1=str.substring(0, moveN);
			String str2=str.substring(moveN,strLength);
			return str2.concat(str1);
		
	    }
	 
	 
	 public String ReverseSentence(String str) {
	        int strLength=str.length();
			String[] strArray = str.split(" ");
			StringBuilder newStr = new StringBuilder();
			if(strArray.length==0) {
				for(int i=0;i<strLength;i++) {
					newStr.append(" ");
				}
			}
			for (int i = strArray.length - 1; i >= 0; i--) {
				System.out.println(strArray[i]);
				if (i != 0) {
					newStr.append(strArray[i] + " ");
				}
				if (i == 0) {
					newStr.append(strArray[i]);
				}
			}
			return newStr.toString();
		
	    }

	public static void main(String[] args) {
		Solution s = new Solution();
		String str = "      ";
		System.out.println(s.ReverseSentence(str).length());

	}
}
