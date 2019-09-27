
public class Main {
	public static void main(String[]args) {
		/*
		 * Carro => Classe
		 * c1 = variavel(com referencia de memoria para o objeto c1
		 * new => operador de instancia Carro() => chamada do metodo construtor
		 */
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		c1.acelerar(100.0);
		c1.acelerar(-10.0);
		System.out.println(c1.velocidade);
		
	}

}
