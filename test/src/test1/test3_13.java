package test1;

import java.util.HashMap;

public class test3_13 {
	public static int test(String s) {

		int res = 1;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < 10; i++) {
			map.put(i, 0);
		}
		for (int i = 0; i < s.length(); i++) {
			int num = Integer.parseInt(s.substring(i, i + 1));
			map.put(num, map.get(num) + 1);
		}
		int min = Integer.MAX_VALUE;
		for (int i = 1; i < 10; i++) {
			if (map.get(i) < min)
				min = map.get(i);
		}
        System.out.println("min"+min);
		int numOfzero = map.get(0);
		System.out.println("0´ÎÊı"+numOfzero);
		if(numOfzero<min) {
			res = (int) Math.pow(10, numOfzero + 1);
		}
		 else {
			for (int i = 1; i < 10; i++) {
				if (map.get(i) == min) {
					int numofmin = i;
					System.out.println("numofmin   "+numofmin);
					int index = 0;
					int sum = 0;
					while (index != (min + 1)) {
						sum=(int) (sum+numofmin*Math.pow(10, index));
						index++;
					}
					res = sum;
					break;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = test3_13.test("0112233445566778899");

		System.out.println(s);
		
		
	}

}
