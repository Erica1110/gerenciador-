package main;

import repositorio.RepositorioDeProduto;
import repositorio.repositoriotransiente.RepositorioDeClienteTransiente;
import repositorio.repositoriotransiente.RepositorioDeEnderecoTransiente;
import view.InterfaceTexto;

public class Principal {
	public static void main(String[] args) {
		InterfaceTexto interfaceT;
		interfaceT = new InterfaceTexto(new RepositorioDeClienteTransiente(), new RepositorioDeEnderecoTransiente(), new RepositorioDeProduto());
		interfaceT.iniciarGerenciamente();
		  
		
	}

}
