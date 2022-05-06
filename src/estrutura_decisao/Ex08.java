package estrutura_decisao;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
	try (Scanner calculo = new Scanner(System.in)) {
		double n1, n2;
		
		System.out.printf("Digite o primeiro valor: ");
		n1 = calculo.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		n2 = calculo.nextDouble();
		
		if (n1 > n2) {
			System.out.printf("O maior valor é o: %.0f", n1);
		}else {
			System.out.printf("O maior valor é o: %.0f", n2);
		}
	}
	
	
	}

}
