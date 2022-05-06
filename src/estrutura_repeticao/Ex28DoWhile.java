package estrutura_repeticao;

import java.util.Scanner;

public class Ex28DoWhile {

	public static void main(String[] args) {
		try(Scanner num = new Scanner(System.in)) {
			int n1, i;
			n1 = 0;
			i = 1;
			do {
				n1+= i;
				i++;
			}while (i < 100);
			System.out.print(n1);
		}

	}

}
