package model;

public class Produto {
	private int id;
	private String nome;
	private float valor;
	
	private static int numeroDeProdutos=0;

	public Produto (String nome, float valor) {
		this.nome=nome;
		this.valor=valor;
		this.id = Produto.gerarId();
	}
	private  static int gerarId() {
		return numeroDeProdutos++;
	}

	public int getId() {

		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String n) {
		this.nome= n;
		
	}

	public float getValor() {
		return valor;
	}
	
	public void setValor(float v) {
		this.valor =  v;
		
	}
	public String toString(){
		return "id="+id+", nome="+nome+", valor="+valor;
	}
}
