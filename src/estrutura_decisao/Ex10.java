package estrutura_decisao;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
	try (Scanner numeros = new Scanner(System.in)){
		double n1, n2;
		
		System.out.printf("Digite o primeiro valor: ");
		n1 = numeros.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		n2 = numeros.nextDouble();
		
		if (n1 == n2) {
			System.out.printf("Os valores s�o id�nticos!");
		} else if (n1 > n2) {
			System.out.printf("O maior valor �: %.2f!", n1);
		} else {
			System.out.printf("O maior valor �: %.2f!", n2);
		}
	}

	}

}
