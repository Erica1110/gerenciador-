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

	public  Produto get(int id) {
		for (Produto produto : this.produto) {
			if (produto.getid() == id) {
				
				return produto;
			}
		}
		
		throw new RuntimeException("Endereço não encontrado."); 
	}
		

	@Override
	public void add(Produto produto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Produto produto) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Produto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
