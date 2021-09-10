package model;

public class Produto {
	private int id;
	private String nome;
	private int valor;

	public Produto (String nome, int valor) {
		this.nome=nome;
		this.valor=valor;
	}

	public int getid() {

		return id;
	}
	public String getNome() {
		return nome;
	}
	public int getValor() {
		return valor;
	}
}
