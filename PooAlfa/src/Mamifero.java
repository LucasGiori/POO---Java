
public class Mamifero extends Animal {
	private String pelo;
	private String nome;
	
	public Mamifero() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("BEEEEEEEEé");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Dando Leite kskksks");
	}

	
	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	
	
	//MÉTODOS ESPECIAIS
	
	public void mover() {
		System.out.println("Andando");
	}
	



	
	

}
