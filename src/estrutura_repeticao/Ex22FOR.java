package estrutura_repeticao;

import java.util.Scanner;

public class Ex22FOR {

	public static void main(String[] args) {
		try(Scanner maior = new Scanner(System.in)) {
			int n1;
			int n2;
			int i;
			
				System.out.printf("Digite um numero inteiro: ");
				n1 = maior.nextInt();
			
				System.out.printf("Digite outro um numero inteiro: ");
				n2 = maior.nextInt();
				
				i = 1;
			
				for(i = n2; i < n1;) {
					System.out.printf("[ERRO] Numero menor ou igual ao primeiro. Digite novamente: ");
					n2 = maior.nextInt();
				}
				
				System.out.printf("Parab�ns! Voc� digitou %d e %s", n1, n2);
		}

	}

}
