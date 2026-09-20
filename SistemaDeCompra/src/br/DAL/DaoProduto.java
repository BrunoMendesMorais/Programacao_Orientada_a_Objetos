package br.DAL;

	import java.util.ArrayList;
	import java.util.List;

import br.Model.Cliente;
import br.Model.Produto;

public class DaoProduto {
	public int proxIdProduto;
	List<Produto> tabelaProduto=new ArrayList();
	
	public DaoProduto(){
		proxIdProduto = 0;
	}
	
	public void Create(Produto produto) {
		produto.setId(proxIdProduto);
		proxIdProduto ++;
		tabelaProduto.add(produto);
	}
	
	public void Delete(Produto produto) {
		tabelaProduto.remove(produto);
	}
	
	public void Update(Produto produto) {
		Produto produtoBusca=Recover(produto.getId());
		produtoBusca.setId(produto.getId());
		produtoBusca.setNome(produto.getNome());
		produtoBusca.setQuantidade(produto.getQuantidade());
	}
	
	public Produto Recover(int id) {
		for(Produto c:tabelaProduto) {
			if(c.getId()==id) return c;
		}
		return null;
	}
	
	public List<Produto> listar(){
		return tabelaProduto;
	}
}
