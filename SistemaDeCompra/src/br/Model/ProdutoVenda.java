package br.Model;

public class ProdutoVenda {
	private int idProduto;
	private Produto produto;
	private int quantidade;
	
	public ProdutoVenda(int idProduto, Produto produto, int quantidade) {
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setId(int idProduto) {
		this.idProduto = idProduto;
	}
	public int getId(){
		return this.idProduto;  
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return this.produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
