package estrutura_repeticao;

import java.util.Scanner;

public class Ex31While {
	public static void main(String[] args) {
		try(Scanner inteiros = new Scanner(System.in)) {
			int n, i, imp, num;
			i = 0;
			imp = 3;
			num = 2;
			System.out.printf("Digite o valor positivo de N: ");
			n = inteiros.nextInt();
			while(n < 0 || n > 100) {
				System.out.printf("Número inválido, digite novamente: ");
				n = inteiros.nextInt();
			}
			
			while(i < n) {
				System.out.println(num);
				num = num + imp;
				imp = imp + 2;
				i++;
			}

		}
	}

}
