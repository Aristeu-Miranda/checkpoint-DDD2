package estrutura_repeticao;

import java.util.Scanner;

public class Ex26While {

	public static void main(String[] args) {
		try(Scanner num = new Scanner(System.in)) {
			int n1, n2, n3, t;
			
			System.out.printf("Digite um numero: ");
			n1 = num.nextInt();
			
			while (n1 <= 0) {
				System.out.printf("[ERRO] Digite um numero positivo: ");
				n1 = num.nextInt();
				}
			
			System.out.printf("Digite o n° de inicio da tabuada: ");
			n2 = num.nextInt();
			
			System.out.printf("Digite o n° do final da tabuada: ");
			n3 = num.nextInt();
			
			while (n3 < n2) {
				System.out.printf("[ERRO] Digite um numero maior que o primeiro: ");
				n3 = num.nextInt();
			}
			
			System.out.printf("\n\nTabuada do %d:", n1);
			
			while (n2 <= n3) {
				t = n1 * n3;
				System.out.printf("\n%d X %d = %d ", n1, n3, t);
				n3--;
			}
		}

	}

}
