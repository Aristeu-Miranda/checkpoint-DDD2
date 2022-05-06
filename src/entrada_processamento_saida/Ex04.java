package entrada_processamento_saida;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int a, b, c, d, media;
			
			System.out.printf("Digite o primeiro valor: ");
			a = ler.nextInt();
			
			System.out.printf("Digite o segundo valor: ");
			b = ler.nextInt();
			
			System.out.printf("Digite o terceiro valor: ");
			c = ler.nextInt();
			
			System.out.printf("E por ultimo, digite o quarto valor: ");
			d = ler.nextInt();
			
			media = (a + b + c + d) / 4;
			
			System.out.printf("O valor da média de todos os valor é: %d", media);
		}
				
	}

}
