import java.util.Scanner;

public class ImparesFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();

		if (valor >= 1 && valor <= 1000) {
			for (int i = 1; i <= valor; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}
		
		else {
				System.out.println("valor deve ser entre 1 e 1000");
				valor = sc.nextInt();
			}
		
		sc.close();
	}
}
