package br.Model;

public class ProdutoVenda {
	private Produto produto;
	private int quantidade;
	
	public ProdutoVenda(Produto produto, int quantidade) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public int getQuantidade() {
		return quantidade;
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
