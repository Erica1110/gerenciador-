package view;

import java.util.Scanner;

import model.Endereco;
import repositorio.RepositorioDeEndereco;

public class InterfaceTextoEndereco {
	private Scanner scanner;
	private RepositorioDeEndereco repositorio;
	
	public InterfaceTextoEndereco(Scanner sc, RepositorioDeEndereco repositorio) {
		this.scanner=sc;
		this.repositorio=repositorio;
	}
	public Endereco cadastrarEndereco() {
		Endereco endereco=null;
		boolean repete=false;
		do {
			System.out.println("Deseja continuar?");
			
			System.out.println("Processo concluido");
			
			//ler os dados do endereço e ver se o usuario confirma ou cancela
		} while (repete);
		return endereco;
	}
	
	
	
}
