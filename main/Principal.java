package main;

import repositorio.RepositorioDeEndereco;
import repositorio.RepositorioDeProduto;
import repositorio.RepositorioDeVenda;
import repositorio.repositoriotransiente.RepositorioDeClienteTransiente;
import view.InterfaceTexto;

public class Principal {
	public static void main(String[] args) {
		InterfaceTexto interfaceT;
		interfaceT = new InterfaceTexto(new RepositorioDeClienteTransiente(), new RepositorioDeEndereco(), new RepositorioDeVenda(), new RepositorioDeProduto() );
		interfaceT.iniciarGerenciamente();
		
	}

}
