package method.q08;

public class SumLoop {

	public static void main(String[] args) {
		int minNum = 1;
		int maxNum = 100;
		int totalNum = sumLoop(minNum, maxNum);
		System.out.println("最小値:" + minNum);
		System.out.println("最大値:" + maxNum);
		System.out.println("加算結果:" + totalNum);
	}

	public static int sumLoop(int num1, int num2) {
		int totalNum = 0;
		while (num1 <= num2) {
			totalNum += num1;
			num1++;
		}
		return totalNum;
	}

}
