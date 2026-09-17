package br.Model;

public class Venda {
	
	private int id;
	private Cliente cliente;
	private String data;
	
	public Venda(int id, String data, Cliente cliente) {
		this.id = id;
		this.cliente = cliente;
		this.data = data;
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
	
}
