package model;

public class Endereco{
	private int id=0;
	private String cidade;
	private int numeroDaCasa;
	private String bairro;
	private static int  numeroDeEnderecos=0;
	public Endereco (int id,String cidade, int numeroDaCasa, String bairro) {
		this.cidade= cidade;
		this.numeroDaCasa= numeroDaCasa;
		this.bairro=bairro;
		this.id=gerarId();
	}
		
	 
	public static int gerarId() {
		return numeroDeEnderecos++;
	}
	public int getId() {
	
		return id;
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
		return "id"+id+", cidade="+cidade+", numero da casa="+numeroDaCasa+", bairro="+bairro;
	}
}