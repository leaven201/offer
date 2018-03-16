package �������ų���С����_45;

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

			//���¶�������Ĺ���
			//������m��n�����ƴ�ɵ���mn>nm��˵��m���ź��棬���nm>mn��˵��n���ź���
			public int compare(Integer m, Integer n) {
				String s1=m+""+n;
				String s2=n+""+m;
				return s1.compareTo(s2);     //return�����3�֣�1������0˵��s1��2��С��0˵��s2��3������0˵��һ����
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
