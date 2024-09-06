package instanceSample;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Brave brave = new Brave("勇者",100,20);
	
		Brave warrior = new Brave("戦士",90,15);
	
		
		System.out.println("---------------------------");
		System.out.println(brave.name + " " + warrior.name);
		System.out.println("HP:" + brave.hp + "  " + "HP:" + warrior.hp);
		System.out.println("---------------------------");
		
		brave.attack();
		warrior.rest();
		
		System.out.println("---------------------------");
		System.out.println(brave.name + " " + warrior.name);
		System.out.println("HP:" + brave.hp + " " + "HP:" + warrior.hp);
		System.out.println("---------------------------");
		
		List<Brave> braveList = new ArrayList<>();
		braveList.add(brave);
		braveList.add(warrior);
	}

}
