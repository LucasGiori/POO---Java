
public class Aves extends Animal{
	private String penas;
	public Aves() {
		// TODO Auto-generated constructor stub
	}
	public String getPenas() {
		return penas;
	}
	public void setPenas(String penas) {
		this.penas = penas;
	}
	
	
	public void voar() {
		System.out.println("Voando");
	}
	@Override
	public void emitirSom() {
		System.out.println("UEQQ");
		
	}
	@Override
	//Métodos Especiais
	public void alimentar() {
		System.out.println("Alimentando Aves ");
	}
	
}
