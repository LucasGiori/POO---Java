
public class Carro {
	double velocidade=0.0;
	public void acelerar(double velocidade) {
		this.velocidade = this.velocidade +velocidade;// somente a palavra velocidade é a variavel comum, já a this.velocidade 
	}
	public Carro() {
		System.out.println("Crie um Novo Carro");
	}
}
