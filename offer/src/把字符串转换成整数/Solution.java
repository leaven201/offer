package 把字符串转换成整数;

public class Solution {
	public int StrToInt(String str) {
		int sum = 0;
		int length = str.length();
		if (str.equals("") || length == 0)
			return 0;
		for (int i = length - 1; i >= 0; i--) {
			// 10的次方数
			int power = length - 1 - i;
			char charAti = str.charAt(i);
			int numi = -Character.getNumericValue(charAti);
			if (i != 0) {
				if (Character.isDigit(charAti)) {
					sum = (int) (sum + numi * Math.pow(10, power));
					System.out.println(sum);
				}
				if (!Character.isDigit(charAti))
					return 0;
			}
			
			//注意32位存的int范围是2^31-1——-2^31
			
			// 判断正负
			if (i == 0) {
				// 先判断是否是数字
				if (Character.isDigit(charAti)) {
					sum = (int) -(sum + numi * Math.pow(10, power));

				} else {
					if (charAti == '+')
						sum = -sum;
					if (charAti == '-')
						sum = sum;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int res = s.StrToInt("-2147483648");
		System.out.println(res);

	}

}
