package br.DAL;

import java.util.ArrayList;
import java.util.List;

import br.Model.Cliente;

public class DaoCliente {
	List<Cliente> tabelaCliente=new ArrayList();
	
	//CRUD
	public void Create(Cliente cliente) {
		tabelaCliente.add(cliente);
	}
	
	public void Delete(Cliente cliente) {
		tabelaCliente.remove(cliente);
	}
	
	public void Update(Cliente cliente) {
		Cliente clienteBusca=Recover(cliente.getId());
		clienteBusca.setId(cliente.getId());
		clienteBusca.setNome(cliente.getNome());
		clienteBusca.setEndereco(cliente.getEndereco());
	}
	
	public Cliente Recover(int id) {
		for(Cliente c:tabelaCliente) {
			if(c.getId()==id) return c;
		}
		return null;
	}
	
//	public String listar(){
//		String relatorio="";
//		for(Cliente c:tabelaCliente) {
//			relatorio+=c.getId()+"\n"+
//					   c.getNome()+"\n"+
//					   c.getEndereco();
//		}
//		return relatorio;
//	}
	
	public List<Cliente> listar(){
		return tabelaCliente;
	}
	

}
