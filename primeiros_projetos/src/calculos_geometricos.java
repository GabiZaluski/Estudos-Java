import java.util.Locale;
import java.util.Scanner;

public class calculos_geometricos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double valor1 = sc.nextDouble();
		double valor2 = sc.nextDouble();
		double valor3 = sc.nextDouble();
		
		double triangulo_retangulo = valor1 * valor3 / 2;
		double area_circulo = 3.14159 * valor3 * valor3;
		double area_trapezio = (valor1 + valor2) * valor3 / 2;
		double area_quadrado = valor2 * valor2;
		double area_retangulo = valor1 * valor2;
		
		System.out.printf("TRIANGULO: " + "%.3f %n" , triangulo_retangulo);
		System.out.printf("CIRCULO: " + "%.3f %n", area_circulo);
		System.out.printf("TRAPEZIO: " + "%.3f %n", area_trapezio);
		System.out.printf("QUADRADO: " + "%.3f %n", area_quadrado);
		System.out.printf("RETANGULO: " + "%.3f %n", area_retangulo);
		
	
	}
}