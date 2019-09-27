
public class Venda {
	
	
	public Venda() {
		// TODO Auto-generated constructor stub
	}
	
	public void vender(Carros car, Cliente c, Funcionario f) {
		System.out.println("funcionario: " + f.getNome() + " Vendendo carro do Modelo:" + car.getModelo() + " Ano:" + car.getAno()+" Para Cliente " + c.getNome());
	}

}
