
public class JavaApplication {

	public JavaApplication() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) {
		Funcionario f = new Funcionario();
		Vendedor v =  new Vendedor();
		Cliente c  =  new Cliente();
		f.setNome("Lucas Giori Cesconetto");
		
		//System.out.println("Nome: "+f.getNome());
		//f.acessarLoja();
		//f.baterPonto();
		//f.vender();
		v.setNome("Lucas");
		System.out.println("Nome Vendedor: "+v.getNome());
		v.acessarLoja();
		v.baterPonto();
		v.vender();
		c.setNome("Diogo");
		System.out.println("Cliente-> "+c.getNome());
		c.acessarLoja();
		c.comprar();
		c.comprar(f);
	}
	

}
