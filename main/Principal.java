package main;

import repositorio.repositoriotransiente.RepositorioDeClienteTransiente;
import repositorio.repositoriotransiente.RepositorioDeEnderecoTransiente;
import repositorio.repositoriotransiente.RepositorioDeProdutoTransiente;
import view.InterfaceTexto;

public class Principal {
	public static void main(String[] args) {
		InterfaceTexto interfaceT;
		interfaceT = new InterfaceTexto(new RepositorioDeClienteTransiente(), new RepositorioDeEnderecoTransiente(), new RepositorioDeProdutoTransiente());
		interfaceT.iniciarGerenciamente();
		  
		
	}

}
