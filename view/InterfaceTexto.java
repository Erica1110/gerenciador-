package view;

import java.util.Scanner;

import repositorio.RepositorioDeProduto;
import repositorio.repositoriotransiente.RepositorioDeClienteTransiente;
import repositorio.repositoriotransiente.RepositorioDeEnderecoTransiente;

public class InterfaceTexto {
	private Scanner scanner;
	private InterfaceTextoCliente interfaceTextoCliente;
	private InterfaceTextoProduto interfaceTextoProduto;
	private InterfaceTextoEndereco interfaceTextoEndereco;
	
	public InterfaceTexto(RepositorioDeClienteTransiente repositorioDeClienteTransiente, RepositorioDeEnderecoTransiente repositorioDeEnderecoTransiente, RepositorioDeProduto repositorioDeProdutos) {
		this.scanner=new Scanner(System.in);
		this.interfaceTextoCliente= new InterfaceTextoCliente(scanner, repositorioDeClienteTransiente, repositorioDeEnderecoTransiente);
		this.interfaceTextoProduto= new InterfaceTextoProduto(scanner, repositorioDeProdutos, repositorioDeEnderecoTransiente);
		this.interfaceTextoEndereco= new InterfaceTextoEndereco(scanner, repositorioDeEnderecoTransiente);
	}


	public InterfaceTexto(InterfaceTexto repositorios) {
		// TODO Auto-generated constructor stub
	}


	public void iniciarGerenciamente(){
		int opcao=0;
		do {
			System.out.println("===== Menu =====");
			System.out.println("---Digite o menu desejado---");
			System.out.println("1-Clientes");
			System.out.println("2-Produtos");
			System.out.println("3-Endere�o");
			opcao=this.scanner.nextInt();
			scanner.nextLine();
			switch(opcao) {
				case 1:
					this.interfaceTextoCliente.gerenciarClientes();
					break;
				case 2:
					this.interfaceTextoProduto.gerenciarProduto();
					break;
				case 3:
					this.interfaceTextoEndereco.gerenciarEndereco();
			}
			
		}while(opcao!=3);
		System.out.println("Obrigado por usar nosso sistema, volte sempre!");
	}
	
	
	
	
	

}
