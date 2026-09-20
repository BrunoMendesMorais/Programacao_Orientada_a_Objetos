package br.DAL;

import java.util.ArrayList;
import java.util.List;

import br.Model.Cliente;
import br.Model.Produto;
import br.Model.ProdutoVenda;
import br.Model.Venda;

public class DaoVenda {
	List<Venda> tabelaVenda=new ArrayList();
	
	public Venda Create(int id) {
		Venda novaVenda =new Venda(id);
		
		tabelaVenda.add(novaVenda);
		return novaVenda;
	}
	
	public void addProduto(Venda venda,ProdutoVenda produtoVenda) {
		produtoVenda.setId(venda.idProxProd);
		venda.idProxProd ++;
		venda.setProdutoVenda(produtoVenda);
	}
	
	public void removeProduto(Venda venda, int idProduto) {
		venda.revomerProdutoVenda(idProduto);
	}
	
	public void addCliente(Venda venda, Cliente cliente) {
		venda.setCliente(cliente);
	}
	
	public void Delete(Venda venda) {
		tabelaVenda.remove(venda);
	}
	
	public Venda Recover(int id) {
		for(Venda c:tabelaVenda) {
			if(c.getId()==id) return c;
		}
		return null;
	}
	
	public List<Venda> listar(){
		return tabelaVenda;
	}
	
}