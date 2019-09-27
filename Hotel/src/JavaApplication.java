import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
public class JavaApplication {

	public JavaApplication() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		System.out.println("______________________________________");
		
		Gerente g = new Gerente();
		
		g.setNome("Diogo Ranguetti");
		System.out.println("Nome Gerente: "+g.getNome());
		g.Alimentar();
		System.out.println("______________________________________");
		
		Camareiro c = new Camareiro();
		c.setNome("Rafael Facul");
		System.out.println("Nome Camareiro: "+c.getNome());
		c.Alimentar();
		System.out.println("______________________________________");
		
		Recepcionista r = new Recepcionista();
		
		r.setNome("Camila Facul");
		System.out.println("Nome do Recepcionista: "+r.getNome());
		r.Alimentar();
		System.out.println("______________________________________");
		
		Hospede h = new Hospede();
		SuiteMaster sm = new SuiteMaster();
		
		
		h.setNome("Vinicius Facul");
		System.out.println("Hóspede: "+h.getNome());
		h.dormir(sm);
		
		
		System.out.println("______________________________________");
		
		SuiteSimples ss = new SuiteSimples();
		
		h.setNome("Lucas Facul");
		System.out.println("Hóspede: "+h.getNome());
		h.dormir(ss);
		System.out.println("______________________________________");
		
	
		
		
	}
}
