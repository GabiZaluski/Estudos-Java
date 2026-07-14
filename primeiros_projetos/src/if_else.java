import java.util.Locale;
import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
	    double hora;
	    System.out.println("que horas sao?");
	    hora = sc.nextDouble();
	    
	    if (hora < 13) {
	    	System.out.println("bom dia");
	    }
	    
	    else if (hora <19) {
	    	System.out.println("boa tarde");
	    }
	    
	    else {
	    	System.out.println("boa noite");
	    }
	
		sc.close();
		
	}
}