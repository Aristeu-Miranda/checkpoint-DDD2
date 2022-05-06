package estrutura_repeticao;
import java.util.Scanner;

public class Ex22DoWhile {

	public static void main(String[] args) {
		try(Scanner maior = new Scanner(System.in)) {
			int n1;
			int n2;
			
				System.out.printf("Digite um numero inteiro: ");
				n1 = maior.nextInt();
			
				System.out.printf("Digite outro um numero inteiro: ");
				n2 = maior.nextInt();
			
				do {
					System.out.printf("[ERRO] Numero menor ou igual ao primeiro. Digite novamente: ");
					n2 = maior.nextInt();
				}
				while (n1 >= n2);
				
				System.out.printf("Parabéns! Você digitou %d e %s", n1, n2);
		}
			
	}

}
