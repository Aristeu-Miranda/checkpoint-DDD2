package estrutura_repeticao;

import java.util.Scanner;

public class Ex24FOR {

	public static void main(String[] args) {
		try(Scanner maior = new Scanner(System.in)) {
			int n1, i, t;
			
			n1 = 5;
			
			for(i=1; i<=10; i++) {
				t = n1 * i;
				System.out.printf("\n%d X %d = %d ", n1, i, t);
			}
		}
	}
}