package view;

import java.util.Scanner;

import model.Endereco;
import repositorio.RepositorioDeEndereco;

public class InterfaceTextoEndereco {
	private Scanner scanner;
	public RepositorioDeEndereco repositorio;
	public InterfaceTextoCliente interfaceTextoCliente;

	public InterfaceTextoEndereco(Scanner sc, RepositorioDeEndereco repositorio,
			InterfaceTextoCliente interfaceTextoCliente) {
		this.scanner = sc;
		this.repositorio = repositorio;

	}

	public void gerenciarEndereco() {
		int opcao = 0;
		do {
			System.out.println("Selecione a op��o desejada");
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
		int id = 0;
		Endereco endereco = null;
		boolean repete = false;
		String cidade;
		String bairro;
		int numeroDaCasa;
		System.out.println("Qual o nome da sua cidade ?");
		cidade = scanner.nextLine();
		System.out.println("Em qual bairro voc� mora ?");
		bairro = scanner.nextLine();
		System.out.println("E qual o numero da sua casa ?");
		numeroDaCasa = scanner.nextInt();
		System.out.println("os dados cidade=" + cidade + ", bairro=" + bairro + ", numero da casa=" + numeroDaCasa
				+ " est�o coretos?");
		System.out.println("");
		System.out.println("Os dados est�o corretos? Se sim, escreva sim, e se est�o errados escreva editar.");
		do {

			String confirmar = scanner.nextLine();

			if (confirmar.equalsIgnoreCase("Sim")) {
				endereco = new Endereco(id, cidade, numeroDaCasa, bairro);
				repositorio.add(endereco);

				System.out.println("Processo concluido");

				repete = false;
			} else {
				repete = true;
			}

		} while (repete);
		return endereco;

	}

	public Endereco editar() {
		boolean repete = false;
		Endereco enderecoSelecionado = selecionarEndereco();
		if (enderecoSelecionado != null) {
			System.out.println("O endere�o que voc� procura � esse? sim ou n�o?");
			String confirmacao = scanner.nextLine();
			if (confirmacao.equalsIgnoreCase("sim")) {
				do {
					System.out.println("Digite o nome da sua cidade");
					enderecoSelecionado.setCidade(scanner.nextLine());

					System.out.println("Digite o numero da sua casa");
					enderecoSelecionado.setNumeroDaCasa(scanner.nextInt());
					scanner.nextLine();
					System.out.println("Digite o nome do bairro que voc� mora");
					enderecoSelecionado.setBairro(scanner.nextLine());
					System.out.println("Os dados est�o corretos? sim ou n�o");
					confirmacao = scanner.nextLine();
					if (confirmacao.equalsIgnoreCase("sim")) {
						System.out.println("Processo concluido");
						scanner.nextLine();
						repete = false;
					} else {
						repete = true;
					}
				} while (repete);

			} else {
				repete=true;

			}

		} else {
			selecionarEndereco();
		}

		return enderecoSelecionado;
	}

	public Endereco excluirEndereco() {

		Endereco enderecoSelecionado = selecionarEndereco();
		System.out.println("O endere�o que voc� procura � esse? sim ou n�o?");
		String confirmacao = scanner.nextLine();
		if (confirmacao.equalsIgnoreCase("sim")) {
			System.out.println("Tem certeza que deseja deletar esse endere�o? sim ou n�o?");
			confirmacao = scanner.nextLine();
			if (confirmacao.equalsIgnoreCase("sim")) {
				repositorio.delete(enderecoSelecionado);
				System.out.println("Endere�o excluido!");

			} else {
				gerenciarEndereco();
			}
		} else {
			selecionarEndereco();
		}

		return null;
	}

	public Endereco selecionarEndereco() {
		int id = 0;
		Endereco enderecoSelecionado = null;
		boolean repete = false;
		do {
			System.out.println("Digite o id do endere�o");
			id = scanner.nextInt();
			scanner.nextLine();
			enderecoSelecionado = repositorio.get(id);
			System.out.println(enderecoSelecionado);
			if (enderecoSelecionado != null) {
				System.out.print("");
				repete = false;
			} else {
				System.out.println("Endere�o n�o encontrado");
				repete = true;
			}
		} while (repete);

		return enderecoSelecionado;
	}
}
