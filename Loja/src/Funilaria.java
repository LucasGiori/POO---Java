
public class Funilaria {
	private String tinta;

	public Funilaria() {
		// TODO Auto-generated constructor stub
	}

	public String getTinta() {
		return tinta;
	}

	public void setTinta(String tinta) {
		this.tinta = tinta;
	}
	public void pintar(Cliente c) {
		System.out.println("Pintando o carro da cor " + this.getTinta() + " do cliente " + c.getNome());
	}
	public void entregar(Cliente c) {
		System.out.println("Entrega de carro " + c.getEndereco() + " do Cliente " + c.getNome());
	}

}
