package view;

import java.util.List;
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
			System.out.println("Selecione a opção desejada");
			System.out.println("1-Cadastrar");
			System.out.println("2-Editar");
			System.out.println("3-Deletar endereco");
			System.err.println("4-Ver todos");
			System.out.println("5-Sair");
			opcao = this.scanner.nextInt();
			this.scanner.nextLine();
			switch (opcao) {
			case 1:
				cadastrarEndereco();
				break;
			case 2:
				editar();
				break;
			case 3:
				excluirEndereco();
				break;
			case 4:
				exibirTodos();
				break;
			}

		} while (opcao != 5);

	}

	public Endereco cadastrarEndereco() {
		int id = 0;
		boolean repete = false;
		String cidade;
		String bairro;
		int numeroDaCasa;
		System.out.println("Qual o nome da sua cidade ?");
		cidade = scanner.nextLine();
		System.out.println("Em qual bairro você mora ?");
		bairro = scanner.nextLine();
		System.out.println("E qual o numero da sua casa ?");
		numeroDaCasa = scanner.nextInt();scanner.nextLine();
		System.out.println("os dados cidade=" + cidade + ", bairro=" + bairro + ", numero da casa=" + numeroDaCasa
				+ " estão coretos?");
		System.out.println("");
		System.out.println("Os dados estão corretos? Se sim, escreva sim, e se estão errados escreva editar.");
		Endereco endereco = null;
		do {

			String confirmar = scanner.nextLine();

			if (confirmar.equalsIgnoreCase("Sim")) {

				endereco = new Endereco(id, cidade, numeroDaCasa, bairro);
				repositorio.add(endereco);

				

				repete = false;
			} else {
				repete = true;
			}

		} while (repete);

		return endereco;
	}

	public Endereco editar() {
		String confirmar;
		boolean repete = false;
		Endereco enderecoSelecionado = selecionarEndereco();

		do {
			System.out.println("Digite o nome da sua cidade");
			enderecoSelecionado.setCidade(scanner.nextLine());

			System.out.println("Digite o numero da sua casa");
			enderecoSelecionado.setNumeroDaCasa(scanner.nextInt());
			scanner.nextLine();

			System.out.println("Digite o nome do bairro que você mora");
			enderecoSelecionado.setBairro(scanner.nextLine());
			
			System.out.println(enderecoSelecionado);

			System.out.println("Os dados estão corretos? sim ou não");
			confirmar = scanner.nextLine();

			if (confirmar.equalsIgnoreCase("sim")) {
				System.out.println("Processo concluido");
				scanner.nextLine();
				repete = false;

			} else {
				repete = true;
			}
		} while (repete);

		return enderecoSelecionado;
	}
	public void exibirTodos() {
		List<Endereco> endereco = this.repositorio.getAll();
		for (int i = 0; i <endereco.size(); i++) {
			Endereco enderecoSelecionado =endereco.get(i);
			System.out.println(enderecoSelecionado);
		}
	}

	public Endereco excluirEndereco() {

		Endereco enderecoSelecionado = selecionarEndereco();

		System.out.println("Tem certeza que deseja deletar esse endereço? sim ou não?");
		String confirmacao = scanner.nextLine();
		if (confirmacao.equalsIgnoreCase("sim")) {
			repositorio.delete(enderecoSelecionado);
			System.out.println("Endereço excluido!");

		} else {
			gerenciarEndereco();
		}

		return null;
	}

	public Endereco selecionarEndereco() {
		int id = 0;
		String confirmar;
		Endereco enderecoSelecionado = null;
		boolean repete = false;
		do {
			System.out.println("Digite o id do endereço");
			id = scanner.nextInt();
			scanner.nextLine();
			enderecoSelecionado = repositorio.get(id);

			if (enderecoSelecionado != null) {
				System.out.println(enderecoSelecionado);
				System.out.println("O endereço que você está procurando é esse? sim ou não?");
				confirmar = scanner.nextLine();
				if (confirmar.equalsIgnoreCase("sim")) {

					repete = false;
				}

			}
			if (enderecoSelecionado == null) {
				System.out.println("Endereço não encontrado");
				repete = true;
			}
		} while (repete);

		return enderecoSelecionado;
	}
}
