package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int h, b, area;
			
			System.out.printf("Digite a altura do tri�ngulo: ");
			h = ler.nextInt();
			
			System.out.printf("Digite a base do tri�ngulo: ");
			b = ler.nextInt();
			
			area = b * h / 2;
			
			System.out.printf("A �rea do quadrado �: %d m�", area);
		}

	}

}
