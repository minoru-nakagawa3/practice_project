package practice.practice04;

public class Sparrow extends Animal{

	private boolean canFly;

	Sparrow(String name, int age, boolean canFly) {
		super(name,age);
		this.canFly = canFly;
	}

	public void isCanFly() {
		if (canFly == true) {
			System.out.println("飛べます");
		} else {
			System.out.println("飛べません");
		}
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public void showinfo() {
		super.showinfo();
		isCanFly();
	}
	public void cry() {
		System.out.println("鳴き声：チュンチュン");
	}
}
