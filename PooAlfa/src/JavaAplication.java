import java.util.Scanner;

public class JavaAplication {

	public JavaAplication() {
		// TODO Auto-generated constructor stub
	}
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Mamifero m = new Mamifero();
		Repteis r = new Repteis();
		Aves a = new Aves();
		Cachorro c = new Cachorro();
		
		System.out.println("_________________________________________________________");
		m.alimentar();
		m.emitirSom();
		m.seiLa();
		
		m.setNome("Cachorro");
		m.setPelo("AZUL");
		System.out.println("Meu Pelo : "+m.getPelo()+" My Name: "+m.getNome());
		
		m.mover();
		System.out.println("_________________________________________________________");
		
		System.out.println("_________________________________________________________");
		System.out.println("Répteis");
		r.emitirSom();
		r.alimentar();
		r.setCasco("Grosso");
		r.setNome("Jabuti");
		System.out.println("Meu Casco é : "+ r.getCasco()+" My Name: "+r.getNome());
		r.emitirSom();
		
		
		System.out.println("_________________________________________________________");
		System.out.println("Aves");
		a.emitirSom();
		a.voar();
		a.setNome("Laranjinha");
		a.setPenas("Grandes");
		System.out.println("Minha pena é: "+a.getPenas()+" My name é : "+a.getNome());
		System.out.println("_________________________________________________________");
		System.out.println("_________________________________________________________");
		c.latir();
		
		System.out.println("_________________________________________________________");
		System.out.println("_________________________________________________________");

	}

}
