package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;
import model.Endereco;
import repositorio.repositoriotransiente.RepositorioDeClienteTransiente;
import repositorio.repositoriotransiente.RepositorioDeEnderecoTransiente;

public class InterfaceTextoCliente {
	private Scanner scanner;
	private RepositorioDeClienteTransiente repositorio;
	private InterfaceTextoEndereco interfaceTextoEndereco;

	public InterfaceTextoCliente(Scanner sc, RepositorioDeClienteTransiente repositorioDeClienteTransiente,
			RepositorioDeEnderecoTransiente repositorioDeEnderecoTransiente) {
		this.scanner = sc;
		this.repositorio = repositorioDeClienteTransiente;
		this.interfaceTextoEndereco = new InterfaceTextoEndereco(sc, repositorioDeEnderecoTransiente);
	}

	public void gerenciarClientes() {
		int opcao = 0;
		do {
			System.out.println("Digite o menu");
			System.out.println("1-Cadastro");
			System.out.println("2-Exibir todos");
			System.out.println("3-Pesquisar usuario");
			System.out.println("4-Editar");
			System.out.println("5-Delete");
			System.out.println("6-Sair");
			opcao = scanner.nextInt();
			scanner.nextLine();
			switch (opcao) {
			case 1:
				this.cadastrar();
				break;

			case 2:
				this.exibirTodos();
				break;

			case 3:
				this.pesquisarUsuario();
				break;

			case 4:
				this.editar();
				break;

			case 5:
				this.delete();
				break;

			}

		} while (opcao != 6);
		System.out.println("Obrigado por usar nosso sistema, volte sempre!");
	}

	public void cadastrar() {
		String nome = null;
		long cpf = 0;
		long telefone = 0;
		int id = 0;
		Endereco endereco;
		boolean repete = false;
		boolean cancelado = false;

		do {
			System.out.println("Digite seu nome");
			nome = this.scanner.nextLine();
			System.out.println("Digite seu CPF");
			cpf = this.scanner.nextLong();
			System.out.println("Digite seu telefone");
			telefone = this.scanner.nextLong();

			System.out.println("nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone);

			System.out.println("Digite 'confirmar' para continuar ou 'editar' para editar os dados");
			String confirmacao = this.scanner.nextLine();
			if (confirmacao.equalsIgnoreCase("confirmar")) {
	
				
				repete = false;
			}

			else {

				System.out.println("Digite sim se deseja confirmar");
				confirmacao = this.scanner.nextLine();
				if (confirmacao.equalsIgnoreCase("sim")) {
					repete = false;
				} else {
					repete = true;
				}

			}
		} while (repete);

		if (!cancelado) {
			endereco = this.interfaceTextoEndereco.cadastrarEndereco();
			if (endereco != null) {
			
			}

		}

	}

	public Cliente exibirTodos(){
	return null;
		
	}

	

	private void pesquisarUsuario() {

	}

	public Cliente editar() {
		Cliente clienteSelecionado = this.selecionarCliente();
		if (clienteSelecionado != null) {
			System.out.println("O cliente que você procura é esse? digite sim ou nâo");
			System.out.print(clienteSelecionado);
			String confirmacao = this.scanner.nextLine();
			if (confirmacao.equalsIgnoreCase("sim")) {
				cadastrar();
			}
				
			
			}
		return clienteSelecionado;
		}
	
	

	private Cliente delete() {
		Cliente clienteSelecionado = this.selecionarCliente();
		if (clienteSelecionado != null) {
			System.out.println("Tem certeza que deseja continuar? Digite 'sim' para deletar.");
			String confirmacao = this.scanner.nextLine();
			if (confirmacao.equalsIgnoreCase("sim")) {
				this.repositorio.delete(clienteSelecionado);
			}

		}
		return null;
	}

	public Cliente selecionarCliente() {
		int id = 0;
		boolean repete = false;
		Cliente clienteSelecionado = null;
		do {
			System.out.println("Digite o id");
			id = this.scanner.nextInt();
			if (clienteSelecionado != null) {
				System.out.println(clienteSelecionado);
			}
			if (clienteSelecionado == null) {
				System.out.println("Digite 'sim' para procurar novamente");
				repete = true;

			} else {
				repete = false;

			}

		} while (repete);

		return clienteSelecionado;
	}
}
