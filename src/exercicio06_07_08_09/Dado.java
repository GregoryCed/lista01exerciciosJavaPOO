package exercicio06_07_08_09;

import java.util.Random;

public class Dado {
	private Random rand;
	
	public Dado() {
		rand = new Random();
	}
	
	public int lanca() {
		return rand.nextInt(6) + 1;
	}
	
	public static void main(String[] args) {
		Dado d = new Dado();
		System.out.println(d.lanca());
	}
}
