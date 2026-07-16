import java.util.Scanner;

public class switch_case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
			case 1:
				dia = "segunda";
				break;
			case 2:
				dia = "terça";
				break;
			case 3:
				dia = "quarta";
				break;
			case 4:
				dia = "quinta";
				break;
			case 5:
				dia = "sexa";
				break;
			case 6:
				dia = "sábado";
				break;
			case 7:
				dia = "domingo";
				break;
			default:
				dia = "numero nao valido";
				break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}
}