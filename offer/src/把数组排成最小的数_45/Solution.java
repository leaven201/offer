package 把数组排成最小的数_45;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
	public String PrintMinNumber(int [] numbers) {
		String result="";
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<numbers.length;i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list,new Comparator<Integer>() {

			//重新定义排序的规则
			//两个数m、n，如果拼成的数mn>nm则说明m大排后面，如果nm>mn则说明n大排后面
			public int compare(Integer m, Integer n) {
				String s1=m+""+n;
				String s2=n+""+m;
				return s1.compareTo(s2);     //return结果有3种，1、大于0说明s1大；2、小于0说明s2大；3、等于0说明一样大
			}
		});
		
		for(int j=0;j<list.size();j++) {
			result+=list.get(j);
		}
		return result;
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {123,54,654,8,4,5312,78,6546};
		Solution solution=new Solution();
		System.out.println(solution.PrintMinNumber(numbers));
		

	}

}
