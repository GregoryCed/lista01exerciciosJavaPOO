package exercicio10;

import java.util.Random;

public class Partida {

	private Time casa;
	private Time visitante;
	private int golsCasa;
	private int golsVisitante;
	
	public Partida(Time casa, Time visitante) {
		this.casa = casa;
		this.visitante = visitante;
	}
	
	public void simularPartida() {
		Random rd = new Random();
		golsCasa = rd.nextInt(7);
		golsVisitante = rd.nextInt(7);
		
		if(golsCasa > golsVisitante) {
			casa.addPontos(3);
		} else if(golsVisitante > golsCasa) {
			visitante.addPontos(3);
		} else {
			casa.addPontos(1);
			visitante.addPontos(1);
		}
	}
	
	public String toString() {
		return casa.getNome() + " " + golsCasa + " X " + golsVisitante + " " + visitante.getNome();
	}
	
}
