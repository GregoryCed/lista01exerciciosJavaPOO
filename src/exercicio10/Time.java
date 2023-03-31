package exercicio10;

public class Time {
	
	private String nome;
	private int pontos;
	
	public Time(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}
	
	public void addPontos(int pts) {
		this.pontos = this.pontos + pts;
	}
	
	
	
	
	
}
