package model;

public class Cliente {
	private int id;
	private long cpf;
	private String nome;
	private long numeroDoTelefone;
	private Endereco endereco;
	
	private static int numeroDeClientes=0;
	
	public Cliente(long cpf, String nome, long numeroDoTelefone, Endereco endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.numeroDoTelefone = numeroDoTelefone;
		this.endereco = endereco;
		this.id = Cliente.gerarId();
	}
	private static int gerarId() {
		return numeroDeClientes++;
				
	}
	
	public int getid() {
	

		return id;
	}
	
	

}
