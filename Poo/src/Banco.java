
public class Banco {

	public static void main(String[] args) {
		System.out.println("=================");
		System.out.println("=BANK CESCONETTO=");
		System.out.println("=================");
		//CRIANDO UMA INSTANCIA DA CLASSE CONTA
//		E REFERENCIA NA VARIAVEL C1
		Conta c1=new Conta();// A VARIAVEL ARMAZENA A REFERENCIA DE MEMÓRIA
		Conta c2=new Conta();// A VARIAVEL ARMAZENA A REFERENCIA DE MEMÓRIA
		c1.depositar(10.0);
		c2.sacar(5.0);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("Conta 1 Saldo: "+c1.saldo);
		System.out.println("Conta 2 Saldo: "+c2.saldo);
	}

}
