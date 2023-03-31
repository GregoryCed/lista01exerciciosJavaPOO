package exercicio02;

public class Trabalhador {
 
	private String nome;
	private String cargo;
	private double salario;
	
	public Trabalhador(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public static void main(String[] args) {
		Trabalhador greg = new Trabalhador("Gregory", "Monitor", 1200);
		Trabalhador fatima = new Trabalhador("Fátima", "Inspetora", 2300);
		Trabalhador fernando = new Trabalhador("Fernando", "Gerente de TI", 10000);
		
		System.out.println("Trabalhador: " + greg.getNome() + "\nCargo: " + greg.getCargo() + "\nSalário: " + greg.getSalario());
		System.out.println("\nTrabalhador: " + fatima.getNome() + "\nCargo: " + fatima.getCargo() + "\nSalário: " + fatima.getSalario());
		System.out.println("\nTrabalhador: " + fernando.getNome() + "\nCargo: " + fernando.getCargo() + "\nSalário: " + fernando.getSalario());
	}
}
