package exercicio06_07_08_09;

public class Porta {
	
	private int num;
	private boolean estado;
	
	public Porta(int num) {
		this.num = num;
		this.estado = false;
	}
	
	public int getNum() {
		return num;
	}

	public void isEstado() {
		if(estado) {
			System.out.println("A porta está Aberta");
		} else {
			System.out.println("A porta está fechada");
		}
	}

	public void fechar() {
		if(estado) {
			estado = false;
		} else {
			System.out.println("A porta já está fechada");
		}
	}
	
	public void abrir() {
		if(!estado) {
			estado = true;
		} else {
			System.out.println("A porta já está aberta");
		}
	}
	
}
