package repositorio.repositoriotransiente;

import java.util.ArrayList;
import java.util.List;

import model.Produto;
import repositorio.RepositorioDeProduto;

public class RepositorioDeProdutoTransiente extends RepositorioDeProduto {

	private List<Produto> produto;

	public RepositorioDeProdutoTransiente() {
		this.produto = new ArrayList<>();
	}

		

	@Override
	public void add(Produto produto) {
		this.produto.add(produto);
	}

	@Override
	public void delete(Produto produto) {
		this.produto.remove(produto);

	}

	@Override
	public List<Produto> getAll() {
		return produto;
	}
	
	public Produto get(int id) {
		for(Produto produto:this.produto){
			if(produto.getId()==id) {
				return produto;
			}
			}
		
		throw new RuntimeException("Produto não encontrado."); 
	}
}
