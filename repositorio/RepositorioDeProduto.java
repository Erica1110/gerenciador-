package repositorio;

import java.util.List;

import model.Produto;

public abstract class RepositorioDeProduto {
	public abstract Produto get(int id);
	public abstract void add(Produto produto);
	public abstract void delete(Produto produto);
	public abstract List<Produto> getAll();

}
