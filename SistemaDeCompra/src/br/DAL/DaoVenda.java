package br.DAL;

import java.util.ArrayList;
import java.util.List;

import br.Model.Cliente;
import br.Model.Venda;

public class DaoVenda {
	List<Venda> tabelaVenda=new ArrayList();
	
	//CRUD
	public void Create(Venda venda) {
		tabelaVenda.add(venda);
	}
	
	public void Delete(Venda venda) {
		tabelaVenda.remove(venda);
	}
	
	public void Update(Venda venda) {
		Venda vendaBusca=Recover(venda.getId());
		vendaBusca.setId(venda.getId());
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