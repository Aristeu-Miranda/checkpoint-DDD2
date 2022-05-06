package estrutura_decisao;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		try (Scanner calculo = new Scanner(System.in)) {
			double n1, n2, n3;
			
			System.out.printf("Digite o primeiro valor: ");
			n1 = calculo.nextDouble();
			
			System.out.printf("Digite o segundo valor: ");
			n2 = calculo.nextDouble();
			
			System.out.printf("Digite o terceiro valor: ");
			n3 = calculo.nextDouble();
			
			if (n1 > n2 && n1 > n3) {
				System.out.printf("O maior valor é o: %.2f", n1);
			} else if (n2 > n1 && n2 > n3) {
				System.out.printf("O maior valor é o: %.2f", n2);
			} else {
				System.out.printf("O maior valor é o: %.2f", n3);
			}
		}

	}

}
