package br.UI;

import java.util.List;
import java.util.Scanner;

import br.Model.Cliente;

public class UICliente {
	Scanner leitor=new Scanner(System.in);
	
	public Cliente cadastrarCliente() {
		System.out.println("====CADASTRO DE CLIENTE====");
		System.out.println("Digite os dados do cliente:");
		
		System.out.print("\n id:"); 
		int id=leitor.nextInt();
		System.out.print("\n Nome:"); 
		String nome=leitor.next();
		
		Cliente cliente= new Cliente(id,nome);
		
		return cliente;
	}
	
	public void menuCliente() {
		System.out.println("=====GESTÃO DE CLIENTES======");
		System.out.println("[1] - CADASTRAR");
		System.out.println("[2] - EDITAR");
		System.out.println("[3] - BUSCAR");
		System.out.println("[4] - LISTAR");
		System.out.println("--------------------------");
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
		
		System.out.print("\n id:"); 
		int id=leitor.nextInt();
		System.out.print("\n Nome:"); 
		String nome=leitor.next();
		
		cliente.setId(id);
		cliente.setNome(nome);
		
		return cliente;
	}
	
	public boolean excluirCliente(Cliente cliente) {
		System.out.println("=====Excluir Cliente====");
		mostrarCliente(cliente);
		System.out.println("Deseja excluir o cliente?(S)im - (N)ão");
		String resposta=leitor.next();
		
		if(resposta.equals("S")) return true;
		return false;
	}
	
	public void listarCliente(List<Cliente> lista) {
		System.out.println("===LISTA CLIENTES====");
		for(Cliente c:lista) {
			System.out.println("id:"+c.getId()+
					           " nome:"+c.getNome());
			
		}
	}

}