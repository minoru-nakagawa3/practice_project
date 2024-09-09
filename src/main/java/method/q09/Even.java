package method.q09;

public class Even {

	public static void main(String[] args) {
		int num = 1;
		boolean result = checkEven(num);
		if (result == true) {
			System.out.println(num + "は偶数です。");
		} else {
			System.out.println(num + "は奇数です。");
		}
	}

	public static boolean checkEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
