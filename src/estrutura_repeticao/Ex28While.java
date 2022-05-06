package estrutura_repeticao;

import java.util.Scanner;

public class Ex28While {

	public static void main(String[] args) {
		try(Scanner num = new Scanner(System.in)) {
			int n1, i;
			
			n1 = 0;
			i = 1;
			while (i < 100) {
				n1+= i;
				i++;
			}
			System.out.print(n1);
		}

	}

}
