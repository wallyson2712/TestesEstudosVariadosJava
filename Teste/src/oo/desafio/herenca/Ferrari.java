package oo.desafio.herenca;

public class Ferrari extends Carro {

	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}

	/*
	 * @Override void acelerar() {
	 * 
	 * if (velocidadeAtual + 15 > VELOCIDADE_MAXIMA) {
	 * 
	 * velocidadeAtual = VELOCIDADE_MAXIMA; } else { velocidadeAtual += 15;
	 * 
	 * }
	 * 
	 * }
	 */
}
