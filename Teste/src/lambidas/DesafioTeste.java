package lambidas;

import java.text.DecimalFormat;
import java.util.function.Function;

public class DesafioTeste {

	public static void main(String[] args) {

		Produto p = new Produto("Notebook", 3235.89, 0.13);

		Function<Produto, Double> valorCDes = valor -> p.preco * (1 - p.desconto);
		Function<Double, Double> imposto = valor -> valor >= 2500 ? valor * (1 - 0.085) : valor;
		Function<Double, Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;

		double resultadoFinal = valorCDes.andThen(imposto).andThen(frete).apply(p);

		//Formatar números
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.println(df.format(resultadoFinal));;

	}

}
