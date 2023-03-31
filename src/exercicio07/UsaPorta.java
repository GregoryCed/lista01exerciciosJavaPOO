package exercicio07;

public class UsaPorta {

	public static void main(String[] args) {
		Porta corredor[] = new Porta[20];
		
		int k = 0;
		for (int i = 700; i < 705; i++) {
			corredor[k] = new Porta(i);
			k++;
		}

	}

}
