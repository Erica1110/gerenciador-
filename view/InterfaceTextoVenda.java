package view;

import java.util.Scanner;

import repositorio.RepositorioDeVenda;

public class InterfaceTextoVenda {
	private Scanner scanner;
	private RepositorioDeVenda repositorio;
	private InterfaceTextoEndereco InterfaceTextoEndereco;
	private InterfaceTextoProduto InterfaceTextoProduto;
	private InterfaceTextoCliente InterfaceTextoCliente;
	
	public InterfaceTextoVenda(Scanner sc, RepositorioDeVenda repositorio, InterfaceTextoProduto iTProduto, InterfaceTextoCliente iTCliente) {
		this.scanner = sc;
		this.repositorio = repositorio;
	    this.InterfaceTextoProduto = iTProduto;
	    this.InterfaceTextoCliente = iTCliente;
	}
	
	public void gerenciarVendas() {
		
		
	}
		
	
	
	
	
	
}
