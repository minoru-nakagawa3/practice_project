package rollPlaying;

public class Rpg {

	public static void main(String[] args) {
		Slime slime = new Slime("スライム", 5, 5, "青色");
		slime.greeting();
		slime.attack();
		slime.runaway();

	}

}
