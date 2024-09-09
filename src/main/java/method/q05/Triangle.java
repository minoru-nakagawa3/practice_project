package method.q05;

public class Triangle {

	public static void main(String[] args) {
		int bottom = 8;
		int height = 5;
		int totalSize = getTriangle(bottom, height);
		System.out.println("底辺:" + bottom);
		System.out.println("高さ:" + height);
		System.out.println("三角形の面積:" + totalSize);
	}

	public static int getTriangle(int bottom, int height) {
		int num = 2;
		int totalSize = (bottom * height) / num;
		return totalSize;
	}

}
