package 数组中的逆序对_51;

public class Solution {
	public int InversePairs(int[] array) {
		if (array == null || array.length == 0)
			return 0;

		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}

		int count = InversePairsCore(array, copy, 0, array.length - 1);
		return count;

	}

	private int InversePairsCore(int[] array, int[] copy, int low, int high) {
		if (low == high)
			return 0;
		int mid = (low + high) >> 1;
		int leftCount = InversePairsCore(array, copy, low, mid);
		int rightCount = InversePairsCore(array, copy, mid + 1, high);

		// i初始化为前半段最后一个数字的下标
		int i = mid;
		// j初始化为后半段最后一个数字的下标
		int j = high;
		int locCopy = high;
		int count = 0;

		while (i >= low && j > mid) {
			if (array[i] > array[j]) {
				count = (j - mid) + count;
				copy[locCopy--] = array[i--];
				if (count >= 1000000007) {
					count = count % 1000000007;
				}
			} else {
				copy[locCopy--] = array[j--];
			}
		}

		for (; i >= low; i--) {
			copy[locCopy--] = array[i];
		}
		for (; j > mid; j--) {
			copy[locCopy--] = array[j];
		}
		for (int s = low; s <= high; s++) {
			array[s] = copy[s];
		}
		return (leftCount + rightCount + count) % 1000000007;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 0 };
		int count = s.InversePairs(array);
		System.out.println(count);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
