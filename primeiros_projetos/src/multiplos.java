import java.util.Locale;
import java.util.Scanner;

public class multiplos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		if (valor1 %2 == 0 && valor2 %2 == 0) {
			System.out.println("MULTIPLOS");
		}
		else {
			System.out.println("NAO MULTIPLOS");
		}
	
		
	sc.close();	
	}
}