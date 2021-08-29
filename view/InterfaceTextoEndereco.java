package view;

import java.util.Scanner;

import repositorio.RepositorioDeCliente;
import repositorio.RepositorioDeEndereco;

public class InterfaceTextoEndereco {
	private Scanner scanner;
	private RepositorioDeEndereco repositorio;
	
	public InterfaceTextoEndereco(Scanner sc, RepositorioDeEndereco repositorio) {
		this.scanner=sc;
		this.repositorio=repositorio;
	}
}
