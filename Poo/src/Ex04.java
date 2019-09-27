
public class Ex04 {
	public static void main(String[]args) {
		for(int i=1;i<=10;i++){
			System.out.println(fatorial(i));
		}
	}
	public static int fatorial(int n) {
		if (n <= 1) {
			return 1;
		}
		else {
			return n*fatorial(n-1);
		}
	}
	public static int fator_ternario(int n) {
		return n == 0 ? 1 : n * fatorial(n - 1);
	}
}