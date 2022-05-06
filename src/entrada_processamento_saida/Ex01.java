package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int h, b, area;
			
			System.out.printf("Digite a altura do retângulo: ");
			h = ler.nextInt();
			
			System.out.printf("Digite a base do retângulo: ");
			b = ler.nextInt();
			
			area = b * h;
			
			System.out.printf("A área do retangulo é: %d m²", area);
		}

	}

}
