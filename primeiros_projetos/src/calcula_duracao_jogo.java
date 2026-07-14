import java.util.Locale;
import java.util.Scanner;

public class calcula_duracao_jogo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		double hora_inicial = sc.nextDouble();
		double hora_final = sc.nextDouble();
		
		double duracao_jogo;
		if (hora_inicial < hora_final) {
			duracao_jogo = hora_final - hora_inicial;
		}
		else {
			duracao_jogo = 24 - hora_inicial + hora_final;
		}
		
		System.out.println("O JOGO DUROU " + duracao_jogo + " HORA(S)");

		
	    sc.close();	
	}
}