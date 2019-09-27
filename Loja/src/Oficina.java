
public class Oficina {

	private String peca;
	
	public Oficina() {
		// TODO Auto-generated constructor stub
	}
	public String getPeca() {
		return peca;
	}
	public void setPeca(String peca) {
		this.peca = peca;
	}
	public void consertar(Cliente c, Funcionario f) {
		
		System.out.println("Funcionário: " + f.getNome() + " Está consertando carro do cliente " + c.getNome());
	}
	
}
