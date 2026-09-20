package br.Model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private int id;
	private Cliente cliente;
	private String data;
	public int idProxProd;
	private List<ProdutoVenda> produtoVenda =new ArrayList();  	
	
	public Venda(int id) {
		idProxProd = 1;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public void setProdutoVenda(ProdutoVenda produtoVenda) {
		this.produtoVenda.add(produtoVenda);
	}
	
	public void revomerProdutoVenda(int idProduto) {
		this.produtoVenda.remove(idProduto);
	}
	
	public List<ProdutoVenda> getListaProduto() {
		return produtoVenda;
	}
	
}
