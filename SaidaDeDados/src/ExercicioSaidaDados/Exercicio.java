package ExercicioSaidaDados;
import java.util.Locale;

public class Exercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $%.2f%n", product1, price1);
		System.out.printf("%s, wich price is $%.2f%n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d : %s%n", age, code, gender);//%n e a quebra de linha
		
		System.out.printf("Meause with eight decimal places: %f%n", measure);
		

	}

}
