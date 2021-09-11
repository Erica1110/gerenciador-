package view;

import java.util.List;
import java.util.Scanner;

import model.Cliente;
import model.Endereco;
import repositorio.RepositorioDeCliente;
import repositorio.RepositorioDeEndereco;
import repositorio.RepositorioDeProduto;

public class InterfaceTextoCliente {
	private Scanner scanner;
	private RepositorioDeCliente repositorio;
	private InterfaceTextoEndereco interfaceTextoEndereco;

	public InterfaceTextoCliente(Scanner sc, RepositorioDeCliente repositorioDeCliente,
			RepositorioDeEndereco repositorioDeEndereco, RepositorioDeProduto repositorioDeProduto) {
		this.scanner = sc;
		this.repositorio = repositorioDeCliente;
		this.interfaceTextoEndereco = new InterfaceTextoEndereco(sc, repositorioDeEndereco);
	}

	public void gerenciarClientes() {
		int opcao = 0;
		do {
			System.out.println("Selecione a op��o desejada");
			System.out.println("1-Cadastro");
			System.out.println("2-Exibir todos");
			System.out.println("3-Editar");
			System.out.println("4-Delete");
			System.out.println("5-Sair");

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
				this.editar();
				break;

			case 4:
				this.delete();
				break;
			}

		} while (opcao != 5);

	}

	public void cadastrar() {
		String nome = null;
		int id = 0;
		long cpf = 0;
		long numeroDoTelefone = 0;
		Endereco endereco;
		boolean repete = false;
		boolean cancelado = false;

		do {
			System.out.println("Digite seu nome");
			nome = this.scanner.nextLine();
			System.out.println("Digite seu CPF");
			cpf = this.scanner.nextLong();

			System.out.println("Digite seu telefone");
			numeroDoTelefone = this.scanner.nextLong();
			this.scanner.nextLine();

			System.out.println("nome=" + nome + ", cpf=" + cpf + ", telefone=" + numeroDoTelefone);
			System.out.println("");
			System.out.println("Digite 'sim' para continuar ou 'n�o' para editar os dados");
			String confirmacao = this.scanner.nextLine();

			if (confirmacao.equalsIgnoreCase("sim")) {

				repete = false;
			}

			else {

				repete = true;
			}

		} while (repete);

		if (!cancelado)

		{
			endereco = this.interfaceTextoEndereco.cadastrarEndereco();
			if (endereco != null) {
				Cliente cliente = new Cliente(id, cpf, nome, numeroDoTelefone, endereco);
				repositorio.add(cliente);
			}

		}

	}

	public void exibirTodos() {
		List<Cliente> clientes = this.repositorio.getAll();
		for (int i = 0; i < clientes.size(); i++) {
			Cliente clienteSelecionado = clientes.get(i);
			System.out.println(clienteSelecionado);

		}
		this.scanner.nextLine();
	}

	public Cliente editar() {
		String confirmar; 
		boolean repete= false;
		Cliente clienteSelecionado = this.selecionarCliente();
		if (clienteSelecionado != null) {
			System.out.println("O cliente que voc� procura � esse? digite sim ou n�o");
			System.out.println(clienteSelecionado);
			String confirmacao = scanner.nextLine();
			if (confirmacao.equalsIgnoreCase("sim")) {
				
				
				do {
					
					System.out.println("Digite o seu nome");
					clienteSelecionado.setNome(scanner.nextLine());
					
					System.out.println("Digite o numero do seu telefone");
					clienteSelecionado.setNumeroDeTelefone(scanner.nextLong());
					this.scanner.nextLine();
					System.out.println("Digite sua cidade");
					clienteSelecionado.getEndereco().setCidade(scanner.nextLine());
					
					System.out.println("Digite o numero da sua casa");
					clienteSelecionado.getEndereco().setNumeroDaCasa(scanner.nextInt());
					this.scanner.nextLine();
					System.out.println("Digite o nome do bairro que voc� mora");
					clienteSelecionado.getEndereco().setBairro(scanner.nextLine());
					
					System.out.println("Os dados est�o corretos, se est�o escreva 'sim' se n�o escreva 'n�o'.");
					System.out.println("");
					System.out.println(clienteSelecionado);
					confirmar=scanner.nextLine();
					if(confirmar.equalsIgnoreCase("sim")) {
					 System.out.println("Processo concluido");
						
					}else {
						repete = true;
					}
				}while(repete);
				
				
			} else {
				 selecionarCliente();
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
			System.out.println("Digite o id do seu cliente");
			id = this.scanner.nextInt();
			clienteSelecionado = this.repositorio.get(id);
			this.scanner.nextLine();
			if (clienteSelecionado != null) {
				System.out.print("");
			
			}
			if (clienteSelecionado == null) {
				System.out.println("Cliente n�o encontrado");
				repete = true;

			} else {
				repete = false;

			}

		} while (repete);

		return clienteSelecionado;
	}
}
