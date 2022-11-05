package oo.desafio.herenca;

public class CarrosTestes {
	public static void main(String[] args) {
		
		Carro carro1 = new Ferrari(30);
		Carro carro2 = new Fusca(15);
		
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro2.frear();
		carro2.frear();
		
		System.out.println("Velocidade do Carro 1: "+ carro1);
		System.out.println("Velocidade do Carro 2: "+ carro2);
	}

}
