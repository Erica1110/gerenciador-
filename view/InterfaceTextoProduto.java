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
			System.out.println("Selecione a opção desejada");
			System.out.println("1-Cadastrar Produto");
			System.out.println("2-Ver todos produtos");
			System.out.println("3-Ver produto em específico");
			System.out.println("4-Editar produto");
			System.out.println("5-Excluir prooduto");
			System.out.println("6-Sair");
			opcao = this.scanner.nextInt();
			switch (opcao) {

			case 1:
				this.cadastrarProduto();
				break;

			case 2:
				this.exibirTodos();
				break;
			case 3:
				this.editarProduto();
				break;
			case 4:
				this.excluirProdutos();
			}

		} while (opcao != 5);

	}

	public void cadastrarProduto() {
		float valor;
		String nome;
		boolean repete = false;
		String confirmar;
		this.scanner.nextLine();
		do {
			System.out.println("Digite o nome do produto");
			nome = scanner.nextLine();
			System.out.println("Digite o valor do produto");
			valor = scanner.nextFloat();
			this.scanner.nextLine();
			System.out.println("Os dados valor=" + valor + ", nome=" + nome + " estão corretos?");
			System.out.println("Digite sim ou não");
			confirmar = scanner.nextLine();
			Produto produto = new Produto(nome, valor);
			repositorio.add(produto);
			if (confirmar.equalsIgnoreCase("sim")) {

				System.out.println("Cadastro concluido com sucesso");
				
			} else {
				repete = true;
			}

		} while (repete);
		repete = true;

	}

	public void editarProduto() {

	}
	public void exibirTodos() {
		
	}

	public void verProduto() {
		Produto produtoSelecionado= selecionarProduto();
		System.out.println(produtoSelecionado);

	}

	public void excluirProdutos() {

	}

	public Produto selecionarProduto(){
		int id = 0;
		boolean repete= false;
		Produto produtoSelecionado = null;
		do {
			System.out.println("Digite o id do seu cliente");
			id = this.scanner.nextInt();
			produtoSelecionado= this.repositorio.get(id);
			if (produtoSelecionado != null) {
				System.out.println(produtoSelecionado.toString());
				
			}
			
		if (produtoSelecionado == null) {
			System.out.println("Produto não encontrado");
		
			
				
			repete = true;

		} else {
			repete = false;

		}

		}while(repete);

		return produtoSelecionado;

	}
}


