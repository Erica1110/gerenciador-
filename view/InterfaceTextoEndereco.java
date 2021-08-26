package view;

import java.util.Scanner;

public class InterfaceTextoEndereco {
	private Scanner scanner;
	private RepositorioDeEndereco repositorio;
	
	public InterfaceTextoEndereco(Scanner sc, RepositorioDeEndereco repositorio) {
		this.scanner=sc;
		this.repositorio=repositorio;
	}
}
