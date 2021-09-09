package model;

public class Cliente {
	private int id;
	private long cpf;
	private String nome;
	private long numeroDeTelefone;
	private Endereco endereco;

	private static int numeroDeClientes = 0;

	public Cliente(long cpf, String nome, long numeroDeTelefone, Endereco endereco) {
		this.cpf = cpf;
		this.nome = nome;
		this.numeroDeTelefone = numeroDeTelefone;
		this.endereco = endereco;
		this.id = Cliente.gerarId();
	}

	private static int gerarId() {
		return numeroDeClientes++;

	}

	public int getid() {
		return id;
	}

	public long getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public long getNumeroDeTelefone() {
		return numeroDeTelefone;
	}

	public Endereco getEndereco() {
		return endereco;
		
	}
}
