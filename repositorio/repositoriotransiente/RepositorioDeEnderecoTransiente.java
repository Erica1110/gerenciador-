package repositorio.repositoriotransiente;

import java.util.ArrayList;
import java.util.List;

import repositorio.RepositorioDeEndereco;

public class RepositorioDeEnderecoTransiente extends RepositorioDeEndereco {

	private List<Endereco> endereco;
	public RepositorioDeEnderecoTransiente () {
		this.endereco = new ArrayList<>();
	}
	
}



