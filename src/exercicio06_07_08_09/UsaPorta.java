package exercicio06_07_08_09;

public class UsaPorta {

	public static void main(String[] args) {
		Porta corredor[] = new Porta[20];
		
		int k = 0;
		for (int i = 700; i < 705; i++) {
			corredor[k] = new Porta(i);
			k++;
		}
		
		Dado d = new Dado();
		int[] portasAbertas = new int[k];
		for (int i = 0; i < corredor.length; i++) {
			if(corredor[i] != null) {
				if(d.lanca() % 2 == 0) {
					Porta p = new Porta(i);
					p.abrir();
					portasAbertas[i] = i;
				}				
			}
		}
		
		for (int i = 0; i < portasAbertas.length; i++) {
			System.out.println("Porta " + corredor[portasAbertas[i]] + " está aberta!!!");
		}
		
		

	}

}
