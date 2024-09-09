package method.q06;

public class Circle {

	public static void main(String[] args) {
		double radius = 5.0;
		double totalSize = getCircle(radius);
		System.out.println("半径:" + radius);
		System.out.println("円の面積:" + totalSize);
	}

	public static double getCircle(double radius) {
		double pai = 3.14;
		double totalSize = (radius * radius) * pai;
		return totalSize;
	}
}
