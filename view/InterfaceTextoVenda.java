package view;

import java.util.Scanner;

import repositorio.RepositorioDeVenda;

public class InterfaceTextoVenda {
	private Scanner scanner;
	private RepositorioDeVenda repositorio;
	private InterfaceTextoEndereco InterfaceTextoEndereco;
	private InterfaceTextoProduto InterfaceTextoProduto;
	private InterfaceTextoCliente InterfaceTextoCliente;
	
	public InterfaceTextoVenda(Scanner sc, RepositorioDeVenda repositorio, InterfaceTextoProduto iTProduto, InterfaceTextoCliente iTCliente) {
		this.scanner = sc;
		this.repositorio = repositorio;
	    this.InterfaceTextoProduto = iTProduto;
	    this.InterfaceTextoCliente = iTCliente;
	}
	
	public void gerenciarVendas() {
		System.out.println("Digite o menu desejado");
		System.out.println("1-Visualizar compra");
		System.out.println("2-Relatorio de compras");
		System.out.println("3-Exibir vendas");
		System.out.println("4-Nota fiscal");
		System.out.println("5-Sair");
	
		int opcao=this.scanner.nextInt();
		switch(opcao) {
		case 1:
			this.InterfaceTextoCliente.visualizarcompra();
			break;
		case 2:
			this.relatorioDeCompras();
			break;
		case 3:
			this.exibirVendas();
			break;
		case 4:
			this.notasFiscais();
			break;
			
		} while(opcao!=5) {
			System.out.print("Opção não encontrada, digite uma opção existente");
		}
		
		
		
	}
		
	
	
	
	
	
}
