package br.BLL;

import java.util.List;

import br.DAL.DaoProduto;
import br.Model.Produto;

public class CadProduto {
	DaoProduto daoProduto =new DaoProduto();
	
	public void CadastrarProduto(Produto produto) {
		if(produto!=null) {
			daoProduto.Create(produto);
		}
	}
	
	public Produto BuscarProduto(int id) {
		Produto p=daoProduto.Recover(id);
		return p;
	}
	
	public void Produto(Produto produto) {
		daoProduto.Delete(produto);
	}
	
	public void UpdateCliente(Produto produto) {
		daoProduto.Update(produto);
	}
	
	public List<Produto> listarProduto() {
		return daoProduto.listar();
	}
	
	public DaoProduto getDaoProduto() {
		return daoProduto;
	}

}
