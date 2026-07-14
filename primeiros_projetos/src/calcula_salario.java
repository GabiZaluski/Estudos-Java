import java.util.Locale;
import java.util.Scanner;

public class calcula_salario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double numero = sc.nextDouble();
		double horas_trabalhadas = sc.nextDouble();
		double valor_hora = sc.nextDouble();
		double salario = horas_trabalhadas * valor_hora;

		
		System.out.println("NUMBER: "+ numero);
		System.out.printf("SALARY = U$ " + "%.2f", salario);
		
	
	}
}