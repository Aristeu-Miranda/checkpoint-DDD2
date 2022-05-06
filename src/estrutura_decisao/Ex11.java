package estrutura_decisao;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
	try (Scanner retangulo = new Scanner(System.in);) {
		double h, b, area;
		
		System.out.printf("Digite a altura do retângulo: ");
		h = retangulo.nextDouble();
		
		System.out.printf("Digite a base do retângulo: ");
		b = retangulo.nextDouble();
		
		area = b * h;
		
		if (area > 100) {
			System.out.printf("Terreno Grande! A área do retangulo é: %.2f m²", area);
		}
		else {
			System.out.printf("A área do retangulo é: %.2f m²", area);
		}
	}

	}

}
