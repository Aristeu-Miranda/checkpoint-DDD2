package estrutura_repeticao;

import java.util.Scanner;

public class Ex25While {
	public static void main(String[] args) {
		try(Scanner num = new Scanner(System.in)) {
			int n1, i, t;
			
			System.out.printf("Digite um numero: ");
			n1 = num.nextInt();
			
			while (n1 <= 0) {
				System.out.printf("[ERRO] Digite um numero positivo: ");
				n1 = num.nextInt();
				}
			System.out.printf("Ok, você digitou: %d", n1);
			System.out.printf("\n\nTabuada do %d:", n1);
			
			i = 1;
			
			while (i <= 10) {
				t = n1 * i;
				System.out.printf("\n%d X %d = %d ", n1, i, t);
				i++;
			}
		}

	}

}
