package entrada_processamento_saida;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int h, area;
			
			System.out.printf("Digite o valor da aresta: ");
			h = ler.nextInt();
			
			area = h * h;
			
			System.out.printf("A área do quadrado é: %d m²", area);
		}

	}

}
