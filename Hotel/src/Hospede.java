
public class Hospede extends Pessoa{

	public Hospede() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Alimentar() {
		// TODO Auto-generated method stub
		Restaurante();
	}
	
	
	public void Alimentar(SuiteMaster s) {
		System.out.println("Se Alimentando na Suíte Master");
		s.salaJantar();
	}
	
	public void suite(SuiteSimples s) {
		System.out.println("Escolhido Suite Simples");
		s.salaEstudo();
	}
	
	public void suite(SuiteMaster s) {
		System.out.println("Escolhido Suite Simples");
		s.salaJantar();
		s.salaEstar();
	}
	
	public void dormir(SuiteMaster s) {
		s.dormir();		
	}
	
	public void dormir(SuiteSimples s) {
		s.dormir();
	}
}
