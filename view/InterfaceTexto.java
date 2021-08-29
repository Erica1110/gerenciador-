package view;

import java.util.Scanner;

import repositorio.RepositorioDeCliente;
import repositorio.RepositorioDeEndereco;
import repositorio.RepositorioDeProdutos;
import repositorio.RepositorioDeVenda;

public class InterfaceTexto {
	private Scanner scanner;
	private InterfaceTextoCliente interfaceTextoCliente;
	private InterfaceTextoProduto interfaceTextoProduto;
	private InterfaceTextoVenda interfaceTextoVenda;
	private InterfaceTextoEndereco interfaceTextoEndereco;
	
	public InterfaceTexto(RepositorioDeCliente repositorioDeCliente, RepositorioDeEndereco repositorioDeEndereco, RepositorioDeVenda repositorioDeVenda, RepositorioDeProdutos repositorioDeProdutos) {
		this.scanner=new Scanner(System.in);
		this.interfaceTextoCliente=new InterfaceTextoCliente(scanner, repositorioDeCliente, repositorioDeEndereco);
		this.interfaceTextoProduto=new InterfaceTextoProduto(scanner, repositorioDeProdutos, repositorioDeVenda);
		this.interfaceTextoVenda=new InterfaceTextoVenda(scanner, repositorioDeVenda, repositorioDeProdutos, repositorioDeCliente);
		this.interfaceTextoEndereco=new InterfaceTextoEndereco(scanner, repositorioDeEndereco, repositorioDeCliente);
	}
	
	
	public void iniciarGerenciamente(){
		int opcao=0;
		do {//apresentar menu
			opcao=this.scanner.nextInt();
			switch(opcao) {
				case 1:
					this.interfaceTextoCliente.gerenciarClientes();
					break;
				case 2:
					
			}
			
		}while(opcao!=0);
		System.out.println("Obrigado por usar nosso sistema, volte sempre!");
	}
	
	
	
	
	

}
