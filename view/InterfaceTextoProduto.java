package view;

import java.util.List;
import java.util.Scanner;

import model.Cliente;
import model.Produto;
import repositorio.RepositorioDeProduto;

public class InterfaceTextoProduto {
	
	private Scanner scanner;
	private RepositorioDeProduto repositorio;

	public InterfaceTextoProduto(Scanner sc, RepositorioDeProduto repositorioDeProduto, InterfaceTextoCliente interfaceTextoCliente) {
		this.scanner = sc;
		this.repositorio = repositorioDeProduto;

	}


	


	public void gerenciarProduto() {
		int opcao = 0;
		do {
			System.out.println("Selecione a opção desejada");
			System.out.println("1-Cadastrar Produto");
			System.out.println("2-Editar");
			System.out.println("3-Excluir produto");
			System.out.println("4-Ver todos produtos");
			System.out.println("5-Sair");
			
			opcao = this.scanner.nextInt();
			switch (opcao) {

			case 1:
				this.cadastrarProduto();
				break;
				
			case 2:
				this.editarProduto();
				break;
				
			case 3:
				this.excluirProduto();
				
			case 4:
				exibirProdutos();
				break;
			}

		} while (opcao != 5);

	}

	public Produto cadastrarProduto() {
		int id =0;
		float valor;
		String nome;
		boolean repete = false;
		String confirmar;
		this.scanner.nextLine();
		Produto produto=null;	
		do {
			System.out.println("Digite o nome do produto");
			nome = scanner.nextLine();
			System.out.println("Digite o valor do produto em Reais");
			valor = scanner.nextFloat();
			this.scanner.nextLine();
			System.out.println("Os dados valor=R$ " + valor + ", nome=" + nome + " estão corretos?");
			System.out.println("Digite sim ou não");
			confirmar = scanner.nextLine();
					
			
			if (confirmar.equalsIgnoreCase("sim")) {
				produto = new Produto(id, nome, valor);
				repositorio.add(produto);
				System.out.println("Cadastro concluido com sucesso");
				repete = false;
			} else {
				repete = true;
			}

		} while (repete);
		
		return produto;
	}

	public Produto editarProduto(){
		boolean repete = false;
		String confirmar;
		Produto produtoSelecionado = selecionarProduto();
		do {
			System.out.println("Digite o nome do produto");
			produtoSelecionado.setNome(scanner.nextLine());
			
			System.out.println("Digite o valor do produtos em Reais");
			produtoSelecionado.setValor(scanner.nextFloat());
			
			System.err.println(produtoSelecionado);
			System.out.println("O dados estão corretos? sim ou não");
			confirmar=scanner.nextLine();
			
			if(confirmar.equalsIgnoreCase("sim")) {
				System.out.println("Processo comcluido!");
			}else {
				repete = true;
			}
			
		}while(repete);
		
		return produtoSelecionado;
	}


	public void exibirProdutos() {
		List<Produto> produto = this.repositorio.getAll();
		for (int i = 0; i < produto.size(); i++) {
			Produto produtoSelecionado = produto.get(i);
			System.out.println(produtoSelecionado);
		}
		
	}

	public void excluirProduto() {
		Produto produtoSelecionado = selecionarProduto();
		System.out.println(produtoSelecionado);
		System.out.println("O produdo que você quer excluir é esse? sim ou não?");

	}

	public Produto selecionarProduto() {
		int id = 0;
		boolean repete = false;
		Produto produtoSelecionado = null;
		String confirmar;
		do {
			System.out.println("Digite o id do produto ");
			id = this.scanner.nextInt();scanner.nextLine();
			produtoSelecionado = this.repositorio.get(id);
			
			if (produtoSelecionado != null) {
				System.out.println(produtoSelecionado);
				System.out.println("O produto que você procura é esse? sim ou não?");
				confirmar=scanner.nextLine();
				if(confirmar.equalsIgnoreCase("sim")) {
					return produtoSelecionado;
					
				}
			}

			if (produtoSelecionado == null) {
				System.out.println("Produto não encontrado");

				repete = true;

			} else {
				repete = false;

			}

		} while (repete);

		return produtoSelecionado;

	}
}
