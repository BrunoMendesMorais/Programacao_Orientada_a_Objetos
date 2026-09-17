package br.UI;

import java.util.List;
import java.util.Scanner;

import br.Model.Cliente;
import br.Model.Produto;
import br.Model.Venda;

public class UIVenda {
	Scanner leitor=new Scanner(System.in);
	
	public Venda cadastrarVenda(Cliente cliente) {
		System.out.println("====CADASTRO DE VENDA====");
		System.out.println("Digite os dados do cliente:");
		
		System.out.print("\n id:"); 
		int id=leitor.nextInt();
		System.out.print("\n data:"); 
		String  data=leitor.next();
		
		Venda venda= new Venda(id,data, cliente);
		
		return venda;
	}
	
	public void mostrarVenda(Venda venda) {
		System.out.println("=====MOSTRAR VENDA======");
		System.out.println("id:"+venda.getId());
		System.out.println("Nome:"+venda.getCliente().getNome());
		System.out.println("--------------------------");
	}
	
	
	public boolean excluirVenda(Venda venda) {
		System.out.println("=====Excluir VENDA====");
		mostrarVenda(venda);
		System.out.println("Deseja excluir o venda?(S)im - (N)ão");
		String resposta=leitor.next();
		
		if(resposta.equals("S")) return true;
		return false;
	}
	
	public void listarVenda(List<Venda> lista) {
		System.out.println("===LISTA VENDA====");
		for(Venda c:lista) {
			System.out.println("id:"+c.getId());					           
		}
	}

}