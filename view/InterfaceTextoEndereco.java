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
		int opcao = 0;
		System.out.println("Digite a opï¿½ï¿½o desejada");
		do {
			System.out.println("1-Cadastrar");
			System.out.println("2-Editar");
			System.out.println("3-Ver todos");
			switch (opcao) {
			case 1:
				cadastrarEndereco();
				break;
			case 2:
				editar();
			case 3:
				verTodos();
			}

		} while (opcao != 3);
		System.out.println("Obrigado por usar nosso sistema, volte sempre!");

	}

	public Endereco cadastrarEndereco() {
		Endereco endereco = null;
		boolean repete = false;
		String cidade;
		String bairro;
		int numeroDaCasa;
		boolean cancelado = false;
		System.out.println("Qual a sua cidade ?");
	    cidade= scanner.nextLine();
	    System.out.println("Em qual bairro vocï¿½ mora ?");
	    bairro=scanner.nextLine();	
	    System.out.println("E qual o numero da sua casa ?");
	    numeroDaCasa=scanner.nextInt();
	    System.out.print("os dados cidade " +cidade +", bairro " + bairro +", numero da casa "+numeroDaCasa+" estão coretos?");
	    System.out.println("Os dados estão corretos? Se sim, escreva sim, e se estão errados escreva editar.");
		do {

			String confirmar = scanner.nextLine();

			if (confirmar.equalsIgnoreCase("Sim")) {
			
				System.out.println("Processo concluido");
				
			}else {
				 repete= true;
			}
			
			
		} while (repete);
		return endereco;
	
		

	}

	public  Endereco editar() {
		return null;
		
	}

	public Endereco verTodos() {
	 return null;
	}
}
