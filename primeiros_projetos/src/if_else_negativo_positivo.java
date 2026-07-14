import java.util.Locale;
import java.util.Scanner;

public class if_else_negativo_positivo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		}
		
		else if (numero > 0) {
			System.out.println("POSITIVO");
		}
		
		else {System.out.println("ZERO"); 
			
		}
	sc.close();
	
	}
}