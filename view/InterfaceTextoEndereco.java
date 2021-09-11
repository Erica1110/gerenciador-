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
		do {
			System.out.println("Selecione a opção desejada");
			System.out.println("1-Cadastrar");
			System.out.println("2-Editar");
			System.out.println("3-Deletar endereco");
			System.out.println("4-Sair");
			opcao = this.scanner.nextInt();
			this.scanner.nextLine();
			switch (opcao) {
			case 1:
				cadastrarEndereco();
				break;
			case 2:
				editar();
			case 3:
				excluirEndereco();
			}
		
		} while (opcao != 4);

	}

	public Endereco cadastrarEndereco() {
		Endereco endereco = null;
		boolean repete = false;
		String cidade;
		String bairro;
		int numeroDaCasa;
		System.out.println("Qual o nome da sua cidade ?");
	    cidade=scanner.nextLine();
	    System.out.println("Em qual bairro você mora ?");
	    bairro=scanner.nextLine();	
	    System.out.println("E qual o numero da sua casa ?");
	    numeroDaCasa=scanner.nextInt();
	    System.out.println("os dados cidade=" +cidade +", bairro=" + bairro +", numero da casa="+numeroDaCasa+" estão coretos?");
	    System.out.println("");
	    System.out.println("Os dados estão corretos? Se sim, escreva sim, e se estão errados escreva editar.");
		do {

			String confirmar = scanner.nextLine();

			if (confirmar.equalsIgnoreCase("Sim")) {
				endereco= new Endereco(cidade, numeroDaCasa, bairro);
				repositorio.add(endereco);
				
				System.out.println("Processo concluido");
		
				repete = false;
			}else {
				 repete= true;
			}
			
			
		} while (repete);
		return endereco;
		
		

	}

	public Endereco editar() {
		return null;
	}

	public Endereco excluirEndereco() {
		return null;
	}
}
