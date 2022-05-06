package estrutura_repeticao;

import java.util.Scanner;

public class Ex27While {

	public static void main(String[] args) {
		try(Scanner tabu = new Scanner(System.in)) {
			int n1, i, t;
			String a;
			
			n1 = 1;
			i = 1;
			while(i < 20) {
				t = n1 * i;
				System.out.printf("\n%d X %d = %d ", n1, i, t);
				i++;
				if(i == 10) {
					System.out.printf("\nDigite qualquer tecla para continuar: ");
					a = tabu.nextLine();
				}
			}
		}

	}

}
