package repositorio.repositoriotransiente;

import java.util.ArrayList;
import java.util.List;


import model.Endereco;
import repositorio.RepositorioDeEndereco;

public class RepositorioDeEnderecoTransiente extends RepositorioDeEndereco {
	private List<Endereco> endereco;

	public RepositorioDeEnderecoTransiente() {

		this.endereco=new ArrayList<>();
	} 
	

	public Endereco get(int id) {
		for (Endereco endereco : this.endereco) {
			if (endereco.getId() == id) {
				return endereco;
			}

		}
		throw new RuntimeException("Endere�o n�o encontrado.");
	}
	
	public void add(Endereco endereco) {
		this.endereco.add(endereco);
	}

	@Override
	public void delete(Endereco endereco) {
		this.endereco.remove(endereco);

		
	}

	@Override
	public List<Endereco> getAll() {
		return endereco;
	}
}
