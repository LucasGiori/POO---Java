
public class Carro {
	double velocidade=0.0;
	public void acelerar(double velocidade) {
		this.velocidade = this.velocidade +velocidade;// somente a palavra velocidade � a variavel comum, j� a this.velocidade 
	}
	public Carro() {
		System.out.println("Crie um Novo Carro");
	}
}
