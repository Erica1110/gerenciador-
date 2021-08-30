package view;

import java.util.Scanner;

import model.Endereco;
import repositorio.RepositorioDeCliente;
import repositorio.RepositorioDeEndereco;

public class InterfaceTextoCliente {
	private static final boolean = false;
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
		String nome=null;
	    long cpf=0;
	    long telefone=0;
	    int id=0;
	    Endereco endereco;
	    boolean repete=false;
	    boolean cancelado=false;
	   
	    do { 
            System.out.println("Digite sim se deseja continuar");
            if(Sim);
            System.out.println("Bem vindo ao nosso time");
                   
			
		} while (repete);

	    if (!cancelado) {
	    	endereco=this.interfaceTextoEndereco.cadastrarEndereco();
	    	if (endereco!=null) {
	    		//cadastrar o cliente no repositorio
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
		String nome=null;
		 long cpf=0;
		
	do {
		System.out.println("Digite sim se deseja continuar");
		
		System.out.println("Sua conta foi removida");
		
		
	} while (Repete);
	}
	
	}

