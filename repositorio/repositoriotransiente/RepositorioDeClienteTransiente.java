package repositorio.repositoriotransiente;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Endereco;
import repositorio.RepositorioDeCliente;

public class RepositorioDeClienteTransiente extends RepositorioDeCliente {

	private List<Cliente> clientes;
	

	public RepositorioDeClienteTransiente () {
		this.clientes=new ArrayList<>();

	}

	@Override
	public void add(Cliente cliente) {
		this.clientes.add(cliente);
	}

	@Override
	public void delete(Cliente cliente) {
		this.clientes.remove(cliente);

		
	}

	@Override
	public List<Cliente> getAll() {
		return clientes;
	}

	@Override
	public Cliente get(int id) {
		for(Cliente cliente : this.clientes) {
			if(cliente.getId()==id) {
				return cliente;	
			}
		}
		
		throw new RuntimeException("Cliente n?o encontrado.");
	}

	
}
