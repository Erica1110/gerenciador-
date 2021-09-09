package view;

import java.util.Scanner;

import model.Produto;
import repositorio.RepositorioDeEndereco;
import repositorio.RepositorioDeProduto;

public class InterfaceTextoProduto {
	private Scanner scanner;
	private RepositorioDeProduto repositorio;

	public InterfaceTextoProduto(Scanner sc, RepositorioDeProduto repositorioDeProduto,
			RepositorioDeEndereco repositorioDeEndereco) {
		this.scanner = sc;
		this.repositorio = repositorioDeProduto;
		
	}

	public void gerenciarProduto() {
		int opcao = 0;
		do {
			System.out.println("---Digite o menu desejado---");
			System.out.println("1-Cadastrar Produto");
			System.out.println("2-Ver Produto");
			System.out.println("3-Editar Produto");
			System.out.println("4-Excluir Produtor");
			System.out.println("5-Sair");
			 
			opcao=this.scanner.nextInt();
			switch(opcao) {
			
			
			case 1:
				this.cadastrarProduto();
				break;
				
			case 2:
				this.verProduto();
				break;
			case 3:
				this.editarProduto();
				break;
		    }
		}while(opcao!=5);
		    	
		    System.out.println("Opção não encontrada, digite uma opção existente");
		    
			
		    
			
	 }

	public void cadastrarProduto() {
		int valor;
		String nome;
		boolean repete= false; 
		String confirmar;
		do {
			System.out.println("Digite O nome do produto");
			nome=scanner.nextLine();
			System.out.println("Digite o valor do produto");
			valor=scanner.nextInt();
			System.out.println("Os dados valor="+valor+", nome"+nome+" estão corretos?");
			System.out.print("Digite sim ou não");
			confirmar=scanner.nextLine();
			Produto produto= new Produto (nome, valor);
			repositorio.add(produto);
			if (confirmar.equalsIgnoreCase("sim")) {
				
				System.out.print("Cadastro concluido com sucesso :)");
				
			}else {
				repete = true;
			}
			
		}while(repete);
		 repete = true;
		 
	}

	public void editarProduto() {
     
	}

	public void verProduto() {

	}
	public void excluirProdutos() {
		
	}
}
