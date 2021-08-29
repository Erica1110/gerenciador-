package view;

import java.util.Scanner;

import repositorio.RepositorioDeCliente;
import repositorio.RepositorioDeEndereco;

public class InterfaceTextoCliente {
	private Scanner scanner; 
	private RepositorioDeCliente repositorio;
	private InterfaceTextoEndereco interfaceTextoEndereco;
	
	public InterfaceTextoCliente (Scanner sc, RepositorioDeCliente repositorioDeCliente, RepositorioDeEndereco repositorioDeEndereco) {
		this.scanner=sc;
		this.repositorio=repositorioDeCliente;
		this.interfaceTextoEndereco=new InterfaceTextoEndereco(sc, repositorioDeEndereco);
	}
	
	public void gerenciarClientes() {
		
	}
	

}
