import java.util.Locale;

public class condicional_ternaria {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		
		
	}
}