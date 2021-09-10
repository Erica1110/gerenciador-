package model;

public class Endereco{
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
	public String toString() {
		return "cidade="+cidade+", numero da casa"+numeroDaCasa+", bairro="+bairro;
	}
}