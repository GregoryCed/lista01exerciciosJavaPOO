package exercicio05;

public class SaldoBancario {
	
	private double saldo;

	public SaldoBancario(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void debito(double valor) {
		saldo = saldo - valor;
	}
	
	public void credito(double valor) {
		saldo = saldo + valor;
	}
	
	public static void main(String[] args) {
		SaldoBancario sb = new SaldoBancario(5000);
		sb.debito(10000);
		sb.credito(200000);
		
		System.out.println(sb.getSaldo());
		
	}
	
}
