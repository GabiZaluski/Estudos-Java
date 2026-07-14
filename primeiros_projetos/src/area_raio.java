import java.util.Locale;
import java.util.Scanner;

public class area_raio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();    
		double area = 3.14159 * raio * raio;
		System.out.printf("%.4f", area);
	
	
	}
}