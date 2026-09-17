package br.DAL;

	import java.util.ArrayList;
	import java.util.List;

	import br.Model.Produto;

public class DaoProduto {
	List<Produto> tabelaProduto=new ArrayList();
	
	public void Create(Produto produto) {
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
	
}
