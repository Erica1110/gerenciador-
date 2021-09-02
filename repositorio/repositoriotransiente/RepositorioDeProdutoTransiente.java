package repositorio.repositoriotransiente;

import java.util.ArrayList;
import java.util.List;

import model.Produto;
import repositorio.RepositorioDeProduto;

public class RepositorioDeProdutoTransiente extends RepositorioDeProduto{
	
	private List<Produto> produto;
	
	public RepositorioDeProdutoTransiente () {
		this.produtos=new ArrayList<>();
	}
}
