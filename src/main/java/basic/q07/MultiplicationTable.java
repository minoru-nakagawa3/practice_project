package basic.q07;

public class MultiplicationTable {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {

				int num = i * j;
				System.out.print(" ");

				if (num < 10) {
					System.out.print(" ");
				}
				System.out.print(num);
			}
			System.out.println();
		}
	}

}
