package view;

import java.util.Scanner;

import repositorio.RepositorioDeEndereco;
import repositorio.RepositorioDeProduto;


public class InterfaceTextoProduto {
	private Scanner scanner;
	private RepositorioDeProduto repositorio;
	private InterfaceTextoEndereco interfaceTextoEndereco;
	
	
	public InterfaceTextoProduto(Scanner sc, RepositorioDeProduto repositorio, RepositorioDeEndereco repositorioDeEndereco) { 
		this.scanner=sc;
		this.repositorio=repositorio;
		this.interfaceTextoEndereco = new InterfaceTextoEndereco(sc, repositorioDeEndereco);
	}
	
	public void gerenciarProduto() {
	
	}
	
}