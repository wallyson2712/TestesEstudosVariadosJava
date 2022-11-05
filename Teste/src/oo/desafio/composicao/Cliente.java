package oo.desafio.composicao;

import java.util.ArrayList;

public class Cliente {
	
	final String nome;
	final ArrayList<Compra> compra = new ArrayList<Compra>();

	public Cliente(String nome) {
		this.nome = nome;
	}
	
	double obterValorTotal() {
		double totalCompra = 0;
		
		for(Compra compra: compra) {
			totalCompra += compra.obterValorTotal();
		}
			return totalCompra;
	}
	
}
