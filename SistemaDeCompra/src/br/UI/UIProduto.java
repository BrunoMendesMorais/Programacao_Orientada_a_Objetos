package br.UI;

import java.util.List;
import java.util.Scanner;

import br.BLL.CadProduto;
import br.Model.Cliente;
import br.Model.Produto;

public class UIProduto {
	Scanner leitor=new Scanner(System.in);
	
	public void menuProduto(CadProduto cadProduto) {
		int resposta;
		do {
			System.out.println("=====GESTÃO DE PRODUTO======");
			System.out.println("[1] - CADASTRAR");
			System.out.println("[2] - EDITAR");
			System.out.println("[3] - LISTAR");
			System.out.println("[0] - SAIR");
			System.out.println("--------------------------");
			resposta = leitor.nextInt();
			
			switch(resposta){
			case 1:
				cadastrarProduto(cadProduto);
				break;
			case 2:
				listarProduto(cadProduto.listarProduto());
				System.out.println("Digite o id do Produto:");
				System.out.print("\n id:"); 
				int id=leitor.nextInt();
				Produto produto = cadProduto.BuscarProduto(id);
				if(produto == null) {
					System.out.println("--------------------------");
					System.out.println("=====PRODUTO NÃO EXISTE======");
					System.out.println("--------------------------");
				}
				else {
					this.atualizarProduto(produto);
					break;
				}
			case 3:
				listarProduto(cadProduto.listarProduto());
			}
		}while(resposta != 0);
		
	}
	
	public Produto cadastrarProduto(CadProduto cadProduto) {
		System.out.println("====CADASTRO DE PRODUTO====");
		System.out.println("Digite os dados do cliente:");
		
		System.out.print("\n Nome:"); 
		String nome=leitor.next();
		System.out.print("\n Quantidade:"); 
		int  quantidade=leitor.nextInt();
		
		Produto produto= new Produto(0,nome,quantidade);
		
		cadProduto.CadastrarProduto(produto);
		return produto;
	}
	
	public void mostrarProduto(Produto produto) {
		System.out.println("=====MOSTRAR PRODUTO======");
		System.out.println("id:"+produto.getId());
		System.out.println("Nome:"+produto.getNome());
		System.out.println("Quantidade:"+produto.getQuantidade());
		System.out.println("--------------------------");
	}
	
	public Produto atualizarProduto(Produto produto) {
		System.out.println("====ATUALIZAR PRODUTO====");
		System.out.println("Digite os dados do Produto:");
		
		mostrarProduto(produto);
		
		System.out.print("\n Nome:"); 
		String nome=leitor.next();
		System.out.print("\n Quantidade:"); 
		int quantidade=leitor.nextInt();
		
		produto.setNome(nome);
		produto.setQuantidade(quantidade);
		
		return produto;
	}
	
	public boolean excluirProduto(Produto produto) {
		System.out.println("=====EXCLUIR PRODUTO====");
		mostrarProduto(produto);
		System.out.println("Deseja excluir o produto?(S)im - (N)ão");
		String resposta=leitor.next();
		
		if(resposta.equals("S")) return true;
		return false;
	}
	
	public void listarProduto(List<Produto> lista) {
		System.out.println("===LISTA PRODUTO====");
		for(Produto c:lista) {
			System.out.println("id:"+c.getId()+ " nome:"+c.getNome()+ " Estoque:"+ c.getQuantidade());
		}
	}

}