package entrada_processamento_saida;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	
	try (Scanner ler = new Scanner(System.in)) {
		int celsius, fahrenheit;
		
		System.out.printf("Digite a temperatura em °C: ");
		celsius = ler.nextInt();
		
		fahrenheit = (celsius * 9/5) + 32;
		
		System.out.printf("%d°C é equivalente a %d°F.", celsius, fahrenheit);
		}
	
	}

}
