package view;

import java.util.Scanner;

public class InterfaceTexto {
	private Scanner scanner;
	private InterfaceTextoCliente interfaceTextoCliente;
	private InterfaceTextoProduto interfaceTextoProduto;
	private InterfaceTextoVenda interfaceTextoVenda;
	
	public InterfaceTexto(RepositorioDeCliente repositorioDeCliente, RepositorioDeEndereco repositorioDeEndereco, RepositorioDeVenda repositorioDeVenda, RepositorioDeProdutos repositorioDeProdutos) {
		this.scanner=new Scanner(System.in);
		this.interfaceTextoCliente=new InterfaceTextoCliente(scanner, repositorioDeCliente, repositorioDeEndereco);
		this.interfaceTextoProduto=new InterfaceTextoProduto();
		this.interfaceTextoVenda=new InterfaceTextoVenda();
		
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
