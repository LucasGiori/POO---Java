
public class Ex05 {
	public static void main(String[]args) {
		int anterior =0;
		int atual=1;
		while (atual<100) {
			int temp=anterior;
			anterior=atual;
			atual=atual+temp;
			System.out.println(atual);

		}
	}
}