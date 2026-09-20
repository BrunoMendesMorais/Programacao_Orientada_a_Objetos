package br.DAL;

import java.util.ArrayList;
import java.util.List;

import br.Model.Cliente;

public class DaoCliente {
	public int proxCLiente;
	List<Cliente> tabelaCliente=new ArrayList();
	
	public DaoCliente() {
		proxCLiente = 1;
	}
	//CRUD
	public void Create(Cliente cliente) {
		cliente.setId(proxCLiente);
		proxCLiente++;
		tabelaCliente.add(cliente);
	}
	
	public void Delete(Cliente cliente) {
		tabelaCliente.remove(cliente);
	}
	
	public void Update(Cliente cliente) {
		Cliente clienteBusca=Recover(cliente.getId());
		clienteBusca.setId(cliente.getId());
		clienteBusca.setNome(cliente.getNome());
	}
	
	public Cliente Recover(int id) {
		for(Cliente c:tabelaCliente) {
			if(c.getId()==id) return c;
		}
		return null;
	}
	
	public List<Cliente> listar(){
		return tabelaCliente;
	}
}