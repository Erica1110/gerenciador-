package view;

import java.util.Scanner;

import repositorio.RepositorioDeEndereco;
import repositorio.RepositorioDeProduto;


public class InterfaceTextoProduto {
	private Scanner scanner;
	private RepositorioDeProduto repositorio;
	private InterfaceTextoEndereco interfaceTextoEndereco;
	
	
	public InterfaceTextoProduto(Scanner sc, RepositorioDeProduto repositorio, RepositorioDeEndereco repositorioDeEndereco) { 
		this.scanner=sc;
		this.repositorio=repositorio;
		this.interfaceTextoEndereco = new InterfaceTextoEndereco(sc, repositorioDeEndereco);
	}
	
	public void gerenciarProduto() {
		int opcao = 0;
		do {
			System.out.println("Digite o menu desejado");
			System.out.println("1-Valores");
			System.out.println("2-Disponiveis no estoque");
			System.out.println("3-Departamentos");
			System.out.println("4-Sair");
			 
			opcao=this.scanner.nextInt();
			switch(opcao) {
			case 1:
				this.Valores();
				break;
			case 2:
				this.Disponiveis no estoque();
			case 3:
				this.Departamentos();
		}
			
		   } while(opcao!=5);
	
}