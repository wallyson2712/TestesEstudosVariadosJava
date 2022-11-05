package oo.desafio.composicao;

public class Sistema {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Wallyson");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.00, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000.00), 2);
		
		 cliente1.compra.add(compra1);
		  
		 System.out.println(cliente1.obterValorTotal());
		
	}

}
