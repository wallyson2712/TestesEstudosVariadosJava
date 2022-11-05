public class Jantar {
	
	public static void main(String[] args) {
		Comida comida = new Comida("Arroz", 150);
		Comida comida2 = new Comida("Feiao", 120);
		
		Pessoa pessoa = new Pessoa("Wallyson", 800);
		
		System.out.println(pessoa.peso);
		pessoa.Comer(comida);
		System.out.println(pessoa.peso);

	}

}
