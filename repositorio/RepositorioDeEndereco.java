package repositorio;

import java.util.List;

import model.Endereco;

public abstract class RepositorioDeEndereco {
	public abstract Endereco get(int id);
	public abstract void add(Endereco endereco);
	public abstract void delete(Endereco endereco);
	public abstract List<Endereco> getAll();
	

}
