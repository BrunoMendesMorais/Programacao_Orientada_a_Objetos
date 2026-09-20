package br.UI;

import java.util.List;
import java.util.Scanner;

import br.BLL.CadCliente;
import br.Model.Cliente;

public class UICliente {
	Scanner leitor=new Scanner(System.in);
	
	public void cadastrarCliente(CadCliente cadCliente) {
		System.out.println("====CADASTRO DE CLIENTE====");
		System.out.println("Digite os dados do cliente:");
		
		System.out.print("\n Nome:"); 
		String nome=leitor.next();
		
		Cliente cliente= new Cliente(0,nome);
		
		cadCliente.CadastrarCliente(cliente);
	}
	
	public void menuCliente(CadCliente cadCliente) {
		int resposta;
		do {
			System.out.println("=====GESTÃO DE CLIENTES======");
			System.out.println("[1] - CADASTRAR");
			System.out.println("[2] - EDITAR");
			System.out.println("[3] - LISTAR");
			System.out.println("[0] - SAIR");
			System.out.println("--------------------------");
			resposta = leitor.nextInt();
			
			switch(resposta){
			case 1:
				cadastrarCliente(cadCliente);
				break;
			case 2:
				listarCliente(cadCliente.ListarClientes());
				System.out.println("Digite o id do cliente:");
				System.out.print("\n id:"); 
				int id=leitor.nextInt();
				Cliente cliente = cadCliente.BuscarCliente(id);
				if(cliente == null) {
					System.out.println("--------------------------");
					System.out.println("=====CLIENTE NÃO EXISTE======");
					System.out.println("--------------------------");
				}
				else {
					this.atualizarCliente(cliente);
					break;
				}
			case 3:
				listarCliente(cadCliente.ListarClientes());
			}
		}while(resposta != 0);
	}
	
	public void mostrarCliente(Cliente cliente) {
		System.out.println("=====MOSTRAR CLIENTE======");
		System.out.println("id:"+cliente.getId());
		System.out.println("Nome:"+cliente.getNome());
		System.out.println("--------------------------");
	}
	
	public Cliente atualizarCliente(Cliente cliente) {
		System.out.println("====ATUALIZAR CLIENTE====");
		System.out.println("Digite os dados do cliente:");
		
		mostrarCliente(cliente);
		
		System.out.print("\n Nome:"); 
		String nome=leitor.next();
		
		cliente.setNome(nome);
		
		System.out.println("--------------------------");
		System.out.println("=====CLIENTE ATUALIZADO COM SUCESSO======");
		System.out.println("--------------------------");
		
		return cliente;
	}
	
	public boolean excluirCliente(Cliente cliente) {
		System.out.println("=====Excluir Cliente====");
		mostrarCliente(cliente);
		System.out.println("Deseja excluir o cliente?(S)im - (N)ão");
		String resposta=leitor.next();
		
		if(resposta.equals("S")) {
			
		}
		return false;
	}
	
	public void listarCliente(List<Cliente> lista) {
		System.out.println("===LISTA CLIENTES==== \n");
		for(Cliente c:lista) {
			System.out.println("id:"+c.getId()+" nome:"+c.getNome());
			
		}
		System.out.println("-------------------------- \n");
	}

}