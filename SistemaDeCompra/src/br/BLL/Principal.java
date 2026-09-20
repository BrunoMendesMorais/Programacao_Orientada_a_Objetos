package br.BLL;

import java.util.Scanner;

import br.Model.Cliente;
import br.Model.Produto;
import br.Model.ProdutoVenda;
import br.Model.Venda;
import br.UI.UICliente;
import br.UI.UIProduto;
import br.UI.UIVenda;

public class Principal {
	

	public static void main(String[] args) {
		CadProduto cadProduto =new CadProduto();
		CadCliente cadCliente =new CadCliente();
		CadVenda cadVenda = new CadVenda(cadProduto.getDaoProduto(), cadCliente.getDaoCliente());
		
		int resposta = 11;
		
		Scanner leitor =new Scanner(System.in);
		do {
			System.out.println("=====SISTEMA DE COMPRA======");
			System.out.println("Selecione a opção desejada");
			System.out.println("[1] - PRODUTO");
			System.out.println("[2] - CLIENTE");
			System.out.println("[3] - VENDA");
			System.out.println("[0] - SAIR");
			System.out.println("--------------------------");
			
			resposta = leitor.nextInt();
			
			switch(resposta) {
			
			case 1:
				UIProduto produto =new UIProduto();
				produto.menuProduto(cadProduto);
				break;
			case 2:
				UICliente cliente =new UICliente();
				cliente.menuCliente(cadCliente);
				break;
			case 3:
				UIVenda venda =new UIVenda();
				venda.menuVenda(cadVenda,cadProduto,cadCliente);
				break;
			case 0:
				break;
			}
		}while(resposta != 0);
	}

}
