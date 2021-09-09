package model;

public class Endereco{
	private int id= 0;
	private String cidade;
	private int numeroDaCasa;
	private String bairro;
	
	public Endereco (String cidade, int numeroDaCasa, String bairro) {
		this.cidade= cidade;
		this.numeroDaCasa= numeroDaCasa;
		this.bairro=bairro;
	}
		
	 
	public int getid() {
		
		return 0;
	}
	public String getCidade() {
		return cidade;
	}
	public int getNumeroDaCasa() {
		return numeroDaCasa;
	}
	public String getBairro() {
		return bairro;
	}
	
}