
abstract class Animal{
	private String nome;
	private String Ambiente;
	public abstract void emitirSom();
	public abstract void alimentar();

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getAmbiente() {
		return Ambiente;
	}
	public void setAmbiente(String ambiente) {
		Ambiente = ambiente;
	};
	
	//métodos especiais
	public void seiLa() {
		System.out.println("Sei Lá");
	}
}