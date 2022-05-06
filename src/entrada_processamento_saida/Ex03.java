package entrada_processamento_saida;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int h, b, area;
			
			System.out.printf("Digite a altura do triângulo: ");
			h = ler.nextInt();
			
			System.out.printf("Digite a base do triângulo: ");
			b = ler.nextInt();
			
			area = b * h / 2;
			
			System.out.printf("A área do quadrado é: %d m²", area);
		}

	}

}
