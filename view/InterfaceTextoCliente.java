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
			System.out.println("Digite o menu");
			System.out.println("1-Cadastro");
			System.out.println("2-Exibir todos");
			System.out.println("3-Pesquisar cliente");
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
				this.pesquisarCliente();
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

			System.out.println("nome=" + nome + ", cpf=" + cpf + ", telefone=" + numeroDoTelefone);

			System.out.println("Digite 'confirmar' para continuar ou 'editar' para editar os dados");
			String confirmacao = this.scanner.nextLine();
			if (confirmacao.equalsIgnoreCase("confirmar")) {
	
				
				repete = false;
			} 

			else {

				
					repete = true;
			}

			
		}while(repete);

	if(!cancelado)

	{
		endereco = this.interfaceTextoEndereco.cadastrarEndereco();
		if (endereco != null) {
			Cliente cliente = new Cliente(cpf, nome, numeroDoTelefone, endereco);
			repositorio.add(cliente);
		}

	}

	}

	public void exibirTodos(){
		List<Cliente> clientes= this.repositorio.getAll();
		for(int i=0; i<clientes.size(); i++){
			Cliente clienteSelecionado = clientes.get(i);
			System.out.println("Id="+clienteSelecionado);
			
		}
		
		
	}

	private Cliente pesquisarCliente() {
		return null;
	}

	public Cliente editar() {
		Cliente clienteSelecionado = this.selecionarCliente();
		if (clienteSelecionado != null) {
			System.out.println("O cliente que voc� procura � esse? digite sim ou n�o");
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
		int id =0;
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
