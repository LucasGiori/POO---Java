
public class Cliente extends Pessoa {

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	public void comprar() {
		System.out.println("Compra na Internet");
	}
	public void comprar(Funcionario f) {
		System.out.println("Compra na loja,  vendedor: "+ f.getNome());
	}

}
