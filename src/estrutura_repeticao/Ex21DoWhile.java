package estrutura_repeticao;
import java.util.Scanner;

public class Ex21DoWhile {
	public static void main(String[] args) {
		try (Scanner pos = new Scanner(System.in)) {
			int num;
			
			do {
				System.out.printf("Digite um valor positivo: ");
				num = pos.nextInt();
			}
			while (num >= 0);
			
			System.out.printf("[ERRO] Voc? digitou um numero negativo!");
		}

	}
}
