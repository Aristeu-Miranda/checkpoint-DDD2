package estrutura_repeticao;

import java.util.Scanner;

public class Ex25DoWhile {

	public static void main(String[] args) {
		try(Scanner num = new Scanner(System.in)) {
			int n1, i, t;
			 do {
				 System.out.printf("Digite um numero inteiro e positivo: ");
					n1 = num.nextInt();
			 }while (n1 <= 0);
			 
			 System.out.printf("Ok, você digitou: %d", n1);
			 System.out.printf("\n\nTabuada do %d:", n1);
			
			i = 1;
			do {
				t = n1 * i;
				System.out.printf("\n%d X %d = %d ", n1, i, t);
				i++;
			} while (i <= 10);
		}

	}

}
