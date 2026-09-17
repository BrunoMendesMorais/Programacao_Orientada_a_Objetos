package br.BLL;

import java.util.Scanner;

import br.Model.Cliente;
import br.UI.UICadCliente;

public class Principal {

	public static void main(String[] args) {
		
		//cadastro de cliente
		CadCliente cadCliente=new CadCliente();
		UICadCliente uiCliente=new UICadCliente();
		
		Cliente cliente=uiCliente.cadastrarCliente();
		cadCliente.CadastrarCliente(cliente);
		
		//exclusao de cliente
		System.out.println("===Excluir Cliente==="); //UI
		uiCliente.listarCliente(cadCliente.ListarClientes()); //UI
		
		Scanner leitor=new Scanner(System.in); //UI
		System.out.println("Digite o id do cliente a ser excluido:"); //UI
		int id=leitor.nextInt(); //UI
		
		Cliente clienteExclusao=cadCliente.BuscarCliente(id);
		if(clienteExclusao!=null)
			cadCliente.RemoverCliente(clienteExclusao);
		
		//atualizar Cliente
		System.out.println("===Atualizar Cliente==="); //UI
		uiCliente.listarCliente(cadCliente.ListarClientes()); //UI
		
		System.out.println("Digite o id do cliente a ser atualizado:"); //UI
		id=leitor.nextInt(); //UI
		
		Cliente clienteAtualiza=cadCliente.BuscarCliente(id);
		if(clienteAtualiza!=null) {
			uiCliente.atualizarCliente(clienteAtualiza);
		}

	}

}
