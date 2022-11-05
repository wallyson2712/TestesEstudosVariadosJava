import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {

		int quantidadeDeNotas = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas");
		quantidadeDeNotas = entrada.nextInt();

		double[] notas = new double[quantidadeDeNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota %d \r\n", i+1);
			double valorNota = entrada.nextDouble();
			notas[i] = valorNota;
		}

		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];

		}
		double media = soma / notas.length;
		System.out.printf("A média é: %.2f", media);

	}

}