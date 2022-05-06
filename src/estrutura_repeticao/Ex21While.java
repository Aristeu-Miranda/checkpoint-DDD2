package estrutura_repeticao;
import java.util.Scanner;

public class Ex21While {

	public static void main(String[] args) {
		try (Scanner pos = new Scanner(System.in)) {
			int num;
			
			System.out.printf("Digite um valor positivo: ");
			num = pos.nextInt();
			
			while (num >= 0) {
				System.out.printf("Ok, digite novamente um valor positivo: ");
				num = pos.nextInt();
			}
			
			System.out.printf("[ERRO] Você digitou um numero negativo!");
		}

	}

}
