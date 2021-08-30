package view;

import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;
import model.Cliente;
import model.Endereco;
import repositorio.RepositorioDeCliente;
import repositorio.RepositorioDeEndereco;

public class InterfaceTextoCliente {
	private Scanner scanner;
	private RepositorioDeCliente repositorio;
	private InterfaceTextoEndereco interfaceTextoEndereco;

	public InterfaceTextoCliente(Scanner sc, RepositorioDeCliente repositorioDeCliente,
			RepositorioDeEndereco repositorioDeEndereco) {
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
			System.out.println("3-Pesquisar usuario");
			System.out.println("4-Editar");
			System.out.println("5-Delete");
			System.out.println("6-Sair");

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

	private void cadastrar() {
		String nome = null;
		long cpf = 0;
		long telefone = 0;
		int id = 0;
		Endereco endereco;
		boolean repete = false;
		boolean cancelado = false;

		do {
			System.out.println("Digite seu nome");
			nome=this.scanner.nextLine();
			System.out.println("Digite seu CPF");
			cpf=this.scanner.nextLong();
			System.out.println("Digite seu telefone");
			telefone=this.scanner.nextLong();
			
					
			System.out.println("nome="+nome+", cpf="+cpf+", telefone="+telefone);		
					
				
			System.out.println("Digite 'confirmar' para continuar ou 'editar' para editar os dados");
			String confirmacao=this.scanner.nextLine();
			if(confirmacao.equalsIgnoreCase("confirmar")) {
				repete=false;
			}
				
			else {
			
				
				
				System.out.println("Digite sim se deseja confirmar");
				confirmacao=this.scanner.nextLine();
				if(confirmacao.equalsIgnoreCase("sim")) {
					repete=false;
				}else {
					repete=true;
				}
				
		
			}
		} while (repete);

		if (!cancelado) {
			endereco = this.interfaceTextoEndereco.cadastrarEndereco();
			if (endereco != null) {
				// cadastrar o cliente no repositorio
			}

		}

	}

	private void exibirTodos() {

	}

	private void pesquisarUsuario() {

	}

	private void editar() {

	}

	private void delete() {
		Cliente clienteSelecionado= this.selecionarCliente();
		if(clienteSelecionado!=null) {
			System.out.println("Tem certeza que deseja continuar? Digite 'sim' para deletar.");
			String confirmacao=this.scanner.nextLine();
			if(confirmacao.equalsIgnoreCase("sim")) {
				this.repositorio.delete(clienteSelecionado);
			}
			
		}
	}

	public Cliente selecionarCliente() {
		int id=0;
		boolean repete=false;
		Cliente clienteSelecionado=null;
		do {
			System.out.println("Digite o id");
			id=this.scanner.nextInt();
			if(clienteSelecionado!=null) {
				System.out.println(clienteSelecionado);
			}
			if(clienteSelecionado==null){
				System.out.println("Digite 'sim' para procurar novamente");
				repete=true;
				
				
			} else { repete=false;
			}
			
			}
		
		while(repete);
		
		      
	}
}
