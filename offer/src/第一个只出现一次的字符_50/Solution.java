package 第一个只出现一次的字符_50;

import java.util.HashMap;

public class Solution {
	public int FirstNotRepeatingChar(String str) {
		if(str==null||str.length()==0)
			return -1;
		char[] strchar=str.toCharArray();
		int[] times=new int[256];
		for(int i=0;i<str.length();i++) {
			if(times[strchar[i]]==0)
				times[strchar[i]]=1;
			else {
				times[strchar[i]]++;
			}
		}
		for(int i=0;i<str.length();i++) {
			if(times[strchar[i]]==1)
				return i;
		}
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//hashmap方法

//public int FirstNotRepeatingChar(String str) {
//    char[] strchar=str.toCharArray();
//    HashMap<Character, Integer> map=new HashMap<>();
//    for(int i=0;i<strchar.length;i++) {
//    	if(map.get(strchar[i])==null) {
//    		map.put(strchar[i], 1);
//    	}
//    	else
//    	{
//    		map.put(strchar[i],map.get(strchar[i])+1);
//    	}
//    }
//    for(int i=0;i<strchar.length;i++) {
//    	if(map.get(strchar[i])==1)
//    		return i+1;
//    }
//    return 0;
//    
//
//}

