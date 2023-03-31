package exercicio01;

public class Endereco {
	
	private String nome;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private int cep;
	
	public Endereco(String nome, int numero, String bairro, String cidade, String estado, int cep) {
		this.nome = nome;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public static void main(String[] args) {
		Endereco eu = new Endereco("Rua Rosa de Morais", 12, "Água Funda", "São Paulo", "São Paulo", 04155000);
		Endereco fiap = new Endereco("Av. Lins de Vasconcelos", 1222, "Vila Mariana", "São Paulo", "São Paulo", 23123123);
		Endereco vo = new Endereco("Sei lá, não sei", 12121, "Jesuânia", "Jesuânia", "Minas Gerais", 231231);
		
		System.out.println("Meu endereço: " + eu.getNome() + ", " + eu.getNumero());
		System.out.println("\nEndereço da Faculdade: " + fiap.getNome() + ", " + fiap.getNumero());
		System.out.println("\nEndereço da vózinha: " + vo.getNome() + ", " + vo.getNumero());
	}
	
}
