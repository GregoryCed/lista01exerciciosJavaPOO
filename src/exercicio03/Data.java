package exercicio03;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		if(validar(dia, mes, ano)) {			
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		else {
			System.out.println("Valor Inválido !!!");
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
	public boolean validar(int dia, int mes, int ano) {
		
		if(dia < 1 || dia > 31) {
			return false;
		}
		
		else if(mes < 1 || mes > 12) {
			return false;
		}
		
		else if(mes == 2 && dia > 28) {
			return false;
		}
		
		else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
			return false;
		}
		else {
			return true;
		}
		
		
	}
	
}
