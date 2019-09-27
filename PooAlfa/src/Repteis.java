
public class Repteis extends Animal{
	private String Casco;
	
	public Repteis() {
		// TODO Auto-generated constructor stub
	}

	public String getCasco() {
		return Casco;
	}

	public void setCasco(String casco) {
		Casco = casco;
	}
	
	

	@Override
	public void emitirSom() {
		System.out.println("UOQQQ");
	}

	@Override
	public void alimentar() {
		System.out.println("Alimentando Réptil");		
	}
	
	//Métodos Especiais
	
	public void rastejar() {
		System.out.println("Rastejando");
	}
	
	

}
