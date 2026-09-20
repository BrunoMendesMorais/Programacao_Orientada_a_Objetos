package br.BLL;

import java.util.List;

import br.DAL.DaoCliente;
import br.DAL.DaoProduto;
import br.DAL.DaoVenda;
import br.Model.Cliente;
import br.Model.Produto;
import br.Model.ProdutoVenda;
import br.Model.Venda;

public class CadVenda {
	public int ultIdVenda;
	DaoVenda daoVenda = new DaoVenda();
	DaoCliente daoCliente;
	DaoProduto daoProduto;
	
	public CadVenda(DaoProduto daoProduto, DaoCliente daoCliente){
		this.daoProduto = daoProduto;
		this.daoCliente = daoCliente;
		this.ultIdVenda = 0;
	}
	
	public Venda criarVenda(){
		ultIdVenda++;
		return daoVenda.Create(ultIdVenda);
	}
	
	public Venda listarVenda(int idVenda) {
		return daoVenda.Recover(idVenda);
	}
	
	public List<Venda> listarTodasVenda(){		
		List<Venda> vendas = daoVenda.listar();

		return vendas;
	}
	
	public boolean addProduto(int idVenda, int idProduto, int quantidadeDesejada) {
		Produto produto = daoProduto.Recover(idProduto);
		Venda venda = daoVenda.Recover(idVenda);
		
		int estoqueAtual = produto.getQuantidade();
		
		if(0>estoqueAtual - quantidadeDesejada || produto == null) 
			return false;
		
		ProdutoVenda produtoNovo =new ProdutoVenda(venda.idProxProd, produto,quantidadeDesejada); 
		
		venda.setProdutoVenda(produtoNovo);
		produto.setQuantidade(estoqueAtual - quantidadeDesejada);
		return true;
	}
	
	public boolean setCliente(int idCliente, int idVenda) {	
		Cliente cliente = daoCliente.Recover(idCliente);
		Venda venda = daoVenda.Recover(idVenda);
		
		if(cliente == null || venda == null)
			return false;
		
		venda.setCliente(cliente);
		return true;
	}
	
	public boolean removerProduto(int idVenda, int idProduto) {
		
		Venda venda = daoVenda.Recover(idVenda);
		Produto produto = daoProduto.Recover(idProduto);
		
		if(produto == null) 
			return false;
		
		daoVenda.removeProduto(venda, idProduto);
		return true;
	}
	
	public void cancelarVenda(int idVenda) {
		Venda venda = daoVenda.Recover(idVenda);
		
		for(ProdutoVenda p: venda.getListaProduto()) {
			this.removerProduto(idVenda, p.getId());
		}
		
		daoVenda.Delete(venda);
	}
	
}
