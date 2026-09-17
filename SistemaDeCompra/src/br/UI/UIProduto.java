package br.UI;

import java.util.List;
import java.util.Scanner;

import br.Model.Produto;

public class UIProduto {
	Scanner leitor=new Scanner(System.in);
	
	public Produto cadastrarProduto() {
		System.out.println("====CADASTRO DE PRODUTO====");
		System.out.println("Digite os dados do cliente:");
		
		System.out.print("\n id:"); 
		int id=leitor.nextInt();
		System.out.print("\n Nome:"); 
		String nome=leitor.next();
		System.out.print("\n Quantidade:"); 
		int  quantidade=leitor.nextInt();
		
		Produto cliente= new Produto(id,nome,quantidade);
		
		return cliente;
	}
	
	public void mostrarProduto(Produto produto) {
		System.out.println("=====MOSTRAR CLIENTE======");
		System.out.println("id:"+produto.getId());
		System.out.println("Nome:"+produto.getNome());
		System.out.println("Quantidade:"+produto.getQuantidade());
		System.out.println("--------------------------");
	}
	
	public Produto atualizarProduto(Produto produto) {
		System.out.println("====ATUALIZAR PRODUTO====");
		System.out.println("Digite os dados do Produto:");
		
		mostrarProduto(produto);
		
		System.out.print("\n id:"); 
		int id=leitor.nextInt();
		System.out.print("\n Nome:"); 
		String nome=leitor.next();
		System.out.print("\n Quantidade:"); 
		int quantidade=leitor.nextInt();
		
		produto.setId(id);
		produto.setNome(nome);
		produto.setQuantidade(quantidade);
		
		return produto;
	}
	
	public boolean excluirCliente(Produto produto) {
		System.out.println("=====Excluir Produto====");
		mostrarProduto(produto);
		System.out.println("Deseja excluir o produto?(S)im - (N)ão");
		String resposta=leitor.next();
		
		if(resposta.equals("S")) return true;
		return false;
	}
	
	public void listarProduto(List<Produto> lista) {
		System.out.println("===LISTA PRODUTO====");
		for(Produto c:lista) {
			System.out.println("id:"+c.getId()+
					           " nome:"+c.getNome());
		}
	}

}