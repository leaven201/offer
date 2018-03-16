package 字符串的排列_38;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 字典排序法
 */

public class Solution {
	public ArrayList<String> Permutation(String str) {
		
		ArrayList<String> result=new ArrayList<>();
		
		//将字符串转为字符数组，然后排序
		if(str==null||str.length()==0)
			return result;
		char[] charstr=str.toCharArray();
		Arrays.sort(charstr);//排序-升序，得到最小数
		result.add(String.valueOf(charstr));		
		
		//停止条件：从右至左，左邻都不小于右邻（最大数）
		while(!isMax(charstr)) {
			int i; //记录从右至左找到第一个左邻小于右邻的数（m）的位置
			int j; //记录从右到左第一个比m大的数（n）的位置
			//从从右至左找到第一个左邻小于右邻的数

			for(int p=charstr.length-1;p>0;p--) {
				if(charstr[p]>charstr[p-1]) {
					i=p-1;
					for(int q=charstr.length-1;q>i;q--) {
						if(charstr[q]>charstr[i])
						{
							j=q;
							//交换m、n
							change(charstr,i,j);
							//将i+1至最后一个元素从小到大排序
							Arrays.sort(charstr, i+1, charstr.length);
							//加入结果
							result.add(String.valueOf(charstr));
							break;
						}
					}					
					break;
				}
			}
		}
		return result;
		
	}
	
	//判断，从右至左，左邻都不小于右邻（最大数）
	public static boolean isMax(char[] charstr) {
		for(int i=charstr.length-1;i>0;i--) {
			//左邻小于右邻
			if(charstr[i-1]<charstr[i])
				return false;
		}
		return true;
	}
	
	//交换char[i]char[j]
	public static void change(char[] charstr,int i,int j) {
		char temp=charstr[i];
		charstr[i]=charstr[j];
		charstr[j]=temp;
	}
	     
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		ArrayList<String> result=s.Permutation("321");
		System.out.println(result);

	}

}
