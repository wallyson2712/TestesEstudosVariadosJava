package oo.desafio.herenca;

public class Carro {

	int velocidadeAtual = 0;
	final int VELOCIDADE_MAXIMA;
	int delta = 5;
	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	void acelerar() {

		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {

			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}

	void frear() {
		if (velocidadeAtual != 0) {

			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}

	}

	public String toString() {
		return "Velocidade atual ? " + velocidadeAtual + " Km/h";

	}
}
