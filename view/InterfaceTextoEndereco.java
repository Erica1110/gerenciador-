package view;

import java.util.Scanner;

import model.Endereco;
import repositorio.RepositorioDeEndereco;

public class InterfaceTextoEndereco {
	private Scanner scanner;
	public RepositorioDeEndereco repositorio;

	public InterfaceTextoEndereco(Scanner sc, RepositorioDeEndereco repositorio) {
		this.scanner = sc;
		this.repositorio = repositorio;
	}

	public void gerenciarEndereco() {
		int opcao=0;
		System.out.println("Digite a opção desejada");
		do {
			System.out.println("1-Cadastrar");
			System.out.println("2-Editar");
			System.out.println("3-Ver todos");
			switch (opcao){
			case 1:
				cadastrarEndereco();
				break;
			case 2:
				editar();
			case 3:
				verTodos();
			}
	     	
		}while (opcao !=3);
		System.out.println("Obrigado por usar nosso sistema, volte sempre!");

	}

	public Endereco cadastrarEndereco() {
		Endereco endereco = null;
		boolean repete = false;
		do {
			System.out.println("Deseja continuar? Escreva sim ou não.");

			String confirmar = scanner.nextLine();

			if (confirmar.equalsIgnoreCase("Sim")) {
			
				System.out.println("Processo concluido");
			}

			// ler os dados do endereço e ver se o usuario confirma ou cancela
		} while (repete);
		return endereco;
	}
	
	public  Endereco editar() {
		Endereco.getid(); 
		
		
	}
	public Endereco verTodos() {
		
	}
}
