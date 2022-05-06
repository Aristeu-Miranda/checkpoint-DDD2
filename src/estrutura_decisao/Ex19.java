package estrutura_decisao;
import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		try (Scanner nota = new Scanner(System.in)) {
			double p1, p2, media;
			
			System.out.printf("Digite a nota na primeira prova: ");
			p1 = nota.nextDouble();
			
			System.out.printf("Digite a nota na segunda prova: ");
			p2 = nota.nextDouble();
			
			media = (p1 + 2 * p2) / 3;
			
			if (media >= 5) {
				System.out.printf("Sua média foi: %.1f! Aprovado", media);
			} else {
				System.out.printf("Sua média foi: %.1f! Reprovado", media);
			}
		}

	}

}
