package view;

import java.util.Scanner;

import model.Endereco;
import repositorio.RepositorioDeEndereco;

public class InterfaceTextoEndereco {
	private Scanner scanner;
	private RepositorioDeEndereco repositorio;

	public InterfaceTextoEndereco(Scanner sc, RepositorioDeEndereco repositorio) {
		this.scanner = sc;
		this.repositorio = repositorio;
	}

	public Endereco cadastrarEndereco() {
		Endereco endereco = null;
		boolean repete = false;
		do {
			System.out.println("Deseja continuar? Escreva sim ou não.");
			
			String confirmar= scanner.nextLine();

			if (confirmar.equalsIgnoreCase ("Sim")) {
				System.out.println("Processo concluido");
			}

			// ler os dados do endereço e ver se o usuario confirma ou cancela
		} while (repete);
		return endereco;
	}

}
