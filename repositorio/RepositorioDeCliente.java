package repositorio;

import java.util.List;

import model.Cliente;

public abstract class RepositorioDeCliente {
	public abstract Cliente get(int id);
	public abstract void add(Cliente cliente);
	public abstract void delete(Cliente cliente);
	public abstract List<Cliente> getAll();
	
	
	
	
		
	
}
