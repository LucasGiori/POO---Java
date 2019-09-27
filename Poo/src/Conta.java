
public class Conta {
	public double saldo;
	
	public boolean sacar(double valor) {
		if(this.saldo<valor) {
			return false;
		}
		else {
			this.saldo =this.saldo -valor;
			return true;
		}
		
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo+valor;
	}

}
