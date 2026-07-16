import java.util.Locale;
import java.util.Scanner;

public class validade_senha {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("senha invalida");
			senha = sc.nextInt();
		}
		System.out.println("senha valida");
	
		sc.close();
		
	}
}