package method.q10;

import java.util.Arrays;

public class EvenNumber {

	public static void main(String[] args) {
		int nums[] = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };
		int count = getEvenNumbers(nums);
		System.out.println(Arrays.toString(nums) + "には、偶数が" + count + "個あります。");
	}

	public static int getEvenNumbers(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (num % 2 == 0) {
				count++;
			}
		}
		return count;
	}
}
