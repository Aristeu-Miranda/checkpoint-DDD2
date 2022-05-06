package estrutura_repeticao;

import java.util.Scanner;

public class Ex24DoWhile {

	public static void main(String[] args) {
		try(Scanner maior = new Scanner(System.in)) {
			int n1, i, t;
			
			n1 = 5;
			i = 1;
			
			do {
				t = n1 * i;
				System.out.printf("\n%d X %d = %d ", n1, i, t);
				i++;
			}
			
			while (i <= 10);
		}

	}

}
