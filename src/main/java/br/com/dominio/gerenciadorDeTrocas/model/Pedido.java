package br.com.dominio.gerenciadorDeTrocas.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Pedido {

	private Long id;
	private Cliente cliente;
	private Date data;
	
	private static List<Produto> produtos = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public void adicionaProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removeProduto(Long id) {
		Iterator<Produto> it = produtos.iterator();
		
		while(it.hasNext()) {
			Produto prod = it.next();
			
			if(prod.getId() == id) {
				it.remove();
			}
		}
	}
}
