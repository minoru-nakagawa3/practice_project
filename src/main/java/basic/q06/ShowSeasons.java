package basic.q06;

public class ShowSeasons {

	public static void main(String[] args) {
		int month = 5;

		switch (month) {
		case 12, 1, 2:
			System.out.println(month + "は冬です。");
			break;

		case 3, 4, 5:
			System.out.println(month + "は春です。");
			break;

		case 6, 7, 8:
			System.out.println(month + "は夏です。");
			break;

		case 9, 10, 11:
			System.out.println(month + "は秋です・");
			break;
		}
	}

}
