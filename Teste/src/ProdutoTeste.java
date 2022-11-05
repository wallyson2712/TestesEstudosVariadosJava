
public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		
		p1.nome = "Notebook";
		p1.preco = 4000;
		Produto.desconto = 0.50;
		
		System.out.println(p1.precoComDesconto());
	}

}
