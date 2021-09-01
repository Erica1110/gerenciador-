package view;

import java.util.Scanner;

import repositorio.RepositorioDeCliente;
import repositorio.RepositorioDeEndereco;
import repositorio.RepositorioDeProduto;

public class InterfaceTexto {
	private Scanner scanner;
	private InterfaceTextoCliente interfaceTextoCliente;
	private InterfaceTextoProduto interfaceTextoProduto;
	
	public InterfaceTexto(RepositorioDeCliente repositorioDeCliente, RepositorioDeEndereco repositorioDeEndereco, RepositorioDeProduto repositorioDeProdutos) {
		this.scanner=new Scanner(System.in);
		this.interfaceTextoCliente=new InterfaceTextoCliente(scanner, repositorioDeCliente, repositorioDeEndereco);
		this.interfaceTextoProduto=new InterfaceTextoProduto(scanner, repositorioDeProdutos, repositorioDeEndereco);
		
	}
	
	
	public void iniciarGerenciamente(){
		int opcao=0;
		do {
			System.out.println("Digite o menu desejado");
			System.out.println("1-Clientes");
			System.out.println("2-Produtos");
			System.out.println("3-Endere�o");
			opcao=this.scanner.nextInt();
			switch(opcao) {
				case 1:
					this.interfaceTextoCliente.gerenciarClientes();
					break;
				case 2:
					this.interfaceTextoProduto.gerenciarProduto();
					break;
			}
			
		}while(opcao!=3);
		System.out.println("Obrigado por usar nosso sistema, volte sempre!");
	}
	
	
	
	
	

}
