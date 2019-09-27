
public class JavaAplication {

	public JavaAplication() {
		// TODO Auto-generated constructor stub
	} 
	public static void main(String[] args) {
		

	//Cliente c = new Cliente();	
	Carros car = new Carros();
	Funcionario fun = new Funcionario();
	Venda v = new Venda();
	
	Cliente c = new Cliente("Juliana","Rua mesquita","33655656566","74848","particular");

	
	fun.setNome("Ana");
	fun.setTelefone("6737337473");
	
	car.setAno("2018");
	car.setModelo("2019");
	car.setTipocarro("Flex");
	
	v.vender(car,c, fun);
	
	Oficina	o = new Oficina();
	Funilaria f = new Funilaria();
	
	o.setPeca("Carburador");
	o.consertar(c, fun);
	
	f.setTinta("vermelho");
	f.pintar(c);
	f.entregar(c);

	
	
	
		

	
	}	
	
}
