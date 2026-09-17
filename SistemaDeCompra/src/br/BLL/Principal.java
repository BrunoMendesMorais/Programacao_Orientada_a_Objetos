package br.BLL;

import br.Model.Cliente;
import br.Model.Produto;
import br.Model.ProdutoVenda;
import br.Model.Venda;

public class Principal {

	public static void main(String[] args) {
		Cliente c=new Cliente(1,"Jão");
		Produto p1 =new Produto(1,"Tomate",30);
		ProdutoVenda a1 = new ProdutoVenda(p1,10);
		Venda venda = new Venda(1,"16/05/2026");
		
	}

}
