package oo.desafio.composicao;

import java.util.ArrayList;

public class Compra {
	
	final ArrayList<Item> itens = new ArrayList<>();
	
	double obterValorTotal() {
		
		double totalCompra = 0;
		for (Item item : itens) {
			
			totalCompra += item.quantidade * item.produto.preco;			
		}
		return totalCompra;
		
	}
	
	void adicionarItem(Produto p, int quantidade) {
		
		this.itens.add(new Item(p, quantidade));
	}
	
	void adicionarItem(String nome, double preco, int quantidade) {
			var produto = new Produto(nome, preco);
			this.itens.add(new Item(produto, quantidade));
	}

}
