package view;

import java.util.Scanner;

import repositorio.RepositorioDeCliente;
import repositorio.RepositorioDeEndereco;
import repositorio.RepositorioDeProduto;
import repositorio.RepositorioDeVenda;

public class InterfaceTexto {
	private Scanner scanner;
	private InterfaceTextoCliente interfaceTextoCliente;
	private InterfaceTextoProduto interfaceTextoProduto;
	private InterfaceTextoVenda interfaceTextoVenda;
	
	
	public InterfaceTexto(RepositorioDeCliente repositorioDeCliente, RepositorioDeEndereco repositorioDeEndereco, RepositorioDeVenda repositorioDeVenda, RepositorioDeProduto repositorioDeProdutos) {
		this.scanner=new Scanner(System.in);
		this.interfaceTextoCliente=new InterfaceTextoCliente(scanner, repositorioDeCliente, repositorioDeEndereco);
		this.interfaceTextoProduto=new InterfaceTextoProduto(scanner, repositorioDeProdutos, repositorioDeEndereco);
		this.interfaceTextoVenda=new InterfaceTextoVenda(scanner, repositorioDeVenda, interfaceTextoProduto, interfaceTextoCliente);
		
	}
	
	
	public void iniciarGerenciamente(){
		int opcao=0;
		do {
			System.out.println("Digite o menu desejado");
			System.out.println("1-Clientes");
			System.out.println("2-Vendas");
			System.out.println("3-Produtos");
			System.out.println("4-Sair");
			
			opcao=this.scanner.nextInt();
			switch(opcao) {
				case 1:
					this.interfaceTextoCliente.gerenciarClientes();
					break;
				case 2:
					this.interfaceTextoVenda.gerenciarVendas();
					break;
				case 3:
					this.interfaceTextoProduto.gerenciarProduto();
					break;
			}
			
		}while(opcao!=4);
		System.out.println("Obrigado por usar nosso sistema, volte sempre!");
	}
	
	
	
	
	

}
