
public abstract class Pessoa {
	private String nome;
	
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	//MÉTODOS ESPECIAIS
	public abstract void Alimentar();
	
	public void Restaurante() {
		System.out.println("Se Alimentando no Restaurante");
	}
	
	public void Refeitorio() {
		System.out.println("Se Alimentando no Refeitório");
	}
	
	
	

}
