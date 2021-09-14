package model;

public class Cliente {
	private  int id= 0;
	private long cpf;
	private String nome;
	private long numeroDeTelefone;
	private Endereco endereco;
	
	
	private static int numeroDeClientes = 0;

	public Cliente(int id, long cpf, String nome, long numeroDeTelefone, Endereco endereco) {
		
		this.cpf = cpf;
		this.nome = nome;
		this.numeroDeTelefone = numeroDeTelefone;
		this.endereco = endereco;
		this.id = Cliente.gerarId();
		
	}

	private static int gerarId() {
		return numeroDeClientes++;

	}

	public  int getId() {
		return id;
	}

	public long getCpf() {
		return cpf;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String n) {
		this.nome = n;
	}

	public long getNumeroDeTelefone() {
		return numeroDeTelefone;
	}
	public void setNumeroDeTelefone(long numT) {
		this.numeroDeTelefone = numT;
	}

	public Endereco getEndereco() {
		return endereco;
		
	}
	
	
	public String  toString() {
		return "id="+id+", cpf="+ cpf +", nome="+ nome +", numero do telefone="+ numeroDeTelefone + endereco.toString();
		
	}
}
