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
	public void setCidade(String c) {
		this.cidade=c;
	}
	public int getNumeroDaCasa() {
		return numeroDaCasa;
	}
	public void setNumeroDaCasa(int n) {
		this.numeroDaCasa=n;
	}
		
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String b) {
		this.bairro=b;
	}
	public String toString() {
		return ", cidade="+cidade+", numero da casa="+numeroDaCasa+", bairro="+bairro;
	}
}