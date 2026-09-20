package br.UI;

import java.util.List;
import java.util.Scanner;

import br.BLL.CadCliente;
import br.BLL.CadProduto;
import br.BLL.CadVenda;
import br.Model.Cliente;
import br.Model.Produto;
import br.Model.ProdutoVenda;
import br.Model.Venda;

public class UIVenda {
	Scanner leitor=new Scanner(System.in);
	
	public void menuVenda(CadVenda cadVenda, CadProduto cadProduto, CadCliente cadCliente) {
		int resposta = 11;
		Scanner leitor =new Scanner(System.in);
		do {
			System.out.println("=====GESTÃO DE VENDA======");
			System.out.println("[1] - CADASTRAR");
			System.out.println("[2] - EDITAR");
			System.out.println("[3] - LISTAR");
			System.out.println("[0] - SAIR");
			System.out.println("--------------------------");
			resposta = leitor.nextInt();
			
			switch(resposta) {
				
			case 1:
				Venda novavenda =cadVenda.criarVenda();
				produtoVenda(cadVenda, cadProduto, cadCliente, novavenda.getId());
				break;
			case 2:
				listarVenda(cadVenda.listarTodasVenda());
				int idVenda = leitor.nextInt();
				Venda editarVenda = cadVenda.listarVenda(idVenda);
				mostrarVenda(editarVenda);
				produtoVenda(cadVenda,cadProduto,cadCliente,editarVenda.getId());
				break;
			case 3:
				listarVenda(cadVenda.listarTodasVenda());
				break;
			case 0:
				break;
			}
		}while(resposta != 0);
		
	}
	
	public void produtoVenda(CadVenda cadVenda, CadProduto cadProduto, CadCliente cadCliente, int idVenda) {
		int resposta;
		do {
			System.out.println("=====VENDA ABERTA======");
			System.out.println("[1] - ADCIONAR PRODUTO");
			System.out.println("[2] - REMOVER PRODUTO");
			System.out.println("[3] - INFORMAR CLIENTE");
			System.out.println("[0] - FINALIZAR");
			System.out.println("--------------------------");
			resposta = leitor.nextInt();
			
			switch(resposta) {
			case 1:
				UIProduto uiProduto =new UIProduto();
				uiProduto.listarProduto(cadProduto.listarProduto());
				adicionarProduto(cadVenda,cadProduto,idVenda);
				break;
			case 2:
				mostrarProdutoVenda(cadVenda.listarVenda(idVenda));
				removerProduto(cadVenda,idVenda);
				break;
			case 3:
				UICliente uiCliente =new UICliente();
				uiCliente.listarCliente(cadCliente.ListarClientes());
				informarCliente(cadVenda,idVenda);
				break;
			case 0:
				break;
			}
			
		}while(resposta != 0);
	}
	
	public void mostrarVenda(Venda venda) {
		System.out.println("=====MOSTRAR VENDA======");
		System.out.println("id:"+venda.getId());
		System.out.println("Nome:"+venda.getCliente().getNome());
		System.out.println("--------------------------");
		mostrarProdutoVenda(venda);
	}
	
	public void adicionarProduto(CadVenda cadVenda, CadProduto cadProduto, int idVenda){
		System.out.println("=====ADICIONAR PRODUTO NA VENDA======");
		System.out.println("Digite o id do produto:");
		int id=leitor.nextInt();
		System.out.println("Digite a quantidade:");
		int qtn=leitor.nextInt();
		boolean retorno = cadVenda.addProduto(idVenda, id, qtn);
		if(retorno) {
			System.out.println("--------------------------");
			System.out.println("=====PRODUTO ADICIONADO COM SUCESSO======");
			System.out.println("--------------------------");
		}
		else {
			System.out.println("--------------------------");
			System.out.println("=====NÃO FOI POSSIVEL ADICIONAR O PRODUTO======");
			System.out.println("--------------------------");
		}
	}
	
	public void removerProduto(CadVenda cadVenda, int idVenda) {
		System.out.println("=====REMOVER PRODUTO DA VENDA======");
		System.out.println("Digite o id do produto:");
		int id=leitor.nextInt();
		boolean resposta = cadVenda.removerProduto(idVenda,id);
		if(resposta) {
			System.out.println("--------------------------");
			System.out.println("=====PRODUTO REMOVIDO COM SUCESSO======");
			System.out.println("--------------------------");
		}
		else {
			System.out.println("--------------------------");
			System.out.println("=====NÃO FOI POSSIVEL REMOVER O PRODUTO======");
			System.out.println("--------------------------");
		}
	}
	
	public void informarCliente(CadVenda cadVenda, int idVenda) {
		System.out.println("=====INFORMAR CIENTE DA VENDA======");
		System.out.println("Digite o id do cliente:");
		int id=leitor.nextInt();
		boolean resposta = cadVenda.setCliente(id, idVenda);
		if(resposta) {
			System.out.println("--------------------------");
			System.out.println("=====CLIENTE DEFINIDO COM SUCESSO======");
			System.out.println("--------------------------");
		}
		else {
			System.out.println("--------------------------");
			System.out.println("=====NÃO FOI POSSIVEL INFORMAR O CLIENTE======");
			System.out.println("--------------------------");
		}
	}
	
	public void mostrarProdutoVenda(Venda venda) {
		System.out.println("=====PRODUTOS DA VENDA======");
		for(ProdutoVenda p: venda.getListaProduto()) {
			System.out.println(p.getId()+" Produto:"+p.getProduto().getNome()+" Quantidade"+p.getQuantidade());
		}
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