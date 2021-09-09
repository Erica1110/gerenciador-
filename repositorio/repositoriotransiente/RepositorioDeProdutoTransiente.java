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

	}

	@Override
	public void delete(Produto produto) {
		

	}

	@Override
	public List<Produto> getAll() {
		return null;
	}
	
	public Produto get(int id) {
		for(int i=0; i<produto.size() ; i++){
			Produto produtoSelecionado= this.produto.get(i);
			if (id==produtoSelecionado.getid()) {
				return produtoSelecionado;
			}
		}
		throw new RuntimeException("Produto não encontrado."); 
	}
}
